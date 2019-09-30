package com.jindumooc.material;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 利用ffmpeg将asx，asf，mpg，wmv，3gp，mp4，mov，avi，flv格式转化为mp4存储到本地服务器
 *
 * @autor 马洪升
 * @Date 2019年9月24日13:25:59
 */
public class VideoConvertToMP4 {
    private String sourceVideoPath;//源视频路径
    private String fileRealName;//文件名不包括后缀名
    private String filename;//包括后缀名
    private String videoFolder = VideoConvertToMP4Constants.videoFolder;// 别的格式视频的目录
    private String targetFolder = VideoConvertToMP4Constants.targetFolder;// flv视频的目录
    private String ffmpegPath = VideoConvertToMP4Constants.ffmpegPath;// ffmpeg.exe的目录
    private String imageRealPath = VideoConvertToMP4Constants.imageRealPath;// 截图的存放目录

    public VideoConvertToMP4() {
    }

    //重构构造方法，传入源视频
    public VideoConvertToMP4(String path) {
        sourceVideoPath = path;
    }

    //set和get方法传递path
    public String getPATH() {
        return sourceVideoPath;
    }

    public void setPATH(String path) {
        sourceVideoPath = path;
    }

    /**
     * 转换视频格式
     *
     * @param targetExtension 目标视频后缀名 .xxx
     * @return
     */
    public boolean beginConvert(String targetExtension) {
        File fi = new File(sourceVideoPath);

        filename = fi.getName();             //获取文件名+后缀名

        fileRealName = filename.substring(0, filename.lastIndexOf(".")); //获取不带后缀的文件名-后面加.toLowerCase()小写

        System.out.println("----接收到文件(" + sourceVideoPath + ")需要转换-------");

        //检测本地是否存在
		/*if (checkfile(sourceVideoPath)) {
			System.out.println(sourceVideoPath + "========该文件存在哟 ");
			return false;
		}*/

        System.out.println("----开始转文件(" + sourceVideoPath + ")-------------------------- ");

        //执行转码机制
        if (process(targetExtension)) {

            System.out.println("视频转码结束，开始截图================= ");

            //视频转码完成，调用截图功能
            if (processImg(sourceVideoPath)) {
                System.out.println("截图成功！ ");
            } else {
                System.out.println("截图失败！ ");
            }

            String tempPath = videoFolder + fileRealName + ".avi";
            File file2 = new File(tempPath);
            if (file2.exists()) {
                System.out.println("删除临时文件：" + tempPath);
                file2.delete();
            }

            sourceVideoPath = null;
            return true;
        } else {
            sourceVideoPath = null;
            return false;
        }
    }

    /**
     * 视频截图功能
     *
     * @param sourceVideoPath 需要被截图的视频路径（包含文件名和后缀名）
     * @return
     */
    public boolean processImg(String sourceVideoPath) {

        //先确保保存截图的文件夹存在
        File TempFile = new File(imageRealPath);
        if (TempFile.exists()) {
            if (TempFile.isDirectory()) {
                System.out.println("该文件夹存在。");
            } else {
                System.out.println("同名的文件存在，不能创建文件夹。");
            }
        } else {
            System.out.println("文件夹不存在，创建该文件夹。");
            TempFile.mkdir();
        }

        File fi = new File(sourceVideoPath);
        filename = fi.getName();            //获取视频文件的名称。
        fileRealName = filename.substring(0, filename.lastIndexOf("."));    //获取视频名+不加后缀名 后面加.toLowerCase()转为小写

        List<String> commend = new ArrayList<String>();
        //第一帧： 00:00:01
        //截图命令：time ffmpeg -ss 00:00:01 -i test1.flv -f image2 -y test1.jpg

        commend.add(ffmpegPath);            //指定ffmpeg工具的路径
        commend.add("-ss");
        commend.add("00:00:01");            //1是代表第1秒的时候截图
        commend.add("-i");
        commend.add(sourceVideoPath);        //截图的视频路径
        commend.add("-f");
        commend.add("image2");
        commend.add("-y");
        commend.add(imageRealPath + fileRealName + ".jpg");        //生成截图xxx.jpg

        //打印截图命令
        StringBuffer test = new StringBuffer();
        for (int i = 0; i < commend.size(); i++) {
            test.append(commend.get(i) + " ");
        }
        System.out.println("截图命令:" + test);

        //转码后完成截图功能-还是得用线程来解决
        try {
			/*ProcessBuilder builder = new ProcessBuilder();
			builder.command(commend);
			Process p =builder.start();*/
            //调用线程处理命令
            ProcessBuilder builder = new ProcessBuilder();
            builder.command(commend);
            Process p = builder.start();

            //获取进程的标准输入流
            final InputStream is1 = p.getInputStream();
            //获取进程的错误流
            final InputStream is2 = p.getErrorStream();
            //启动两个线程，一个线程负责读标准输出流，另一个负责读标准错误流
            new Thread() {
                public void run() {
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(is1));
                    try {
                        String lineB = null;
                        while ((lineB = br.readLine()) != null) {
                            if (lineB != null) {
                                //System.out.println(lineB);    //必须取走线程信息避免堵塞
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //关闭流
                    finally {
                        try {
                            is1.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }.start();
            new Thread() {
                public void run() {
                    BufferedReader br2 = new BufferedReader(
                            new InputStreamReader(is2));
                    try {
                        String lineC = null;
                        while ((lineC = br2.readLine()) != null) {
                            if (lineC != null) {
                                //System.out.println(lineC);   //必须取走线程信息避免堵塞
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    //关闭流
                    finally {
                        try {
                            is2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }.start();
            // 等Mencoder进程转换结束，再调用ffmepg进程非常重要！！！
            p.waitFor();
            System.out.println("截图进程结束");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * 实际转换视频格式的方法
     *
     * @param targetExtension 目标视频后缀名
     * @return
     */
    private boolean process(String targetExtension) {
        //先判断视频的类型-返回状态码
        int type = checkContentType();
        boolean status = false;

        //根据状态码处理
        if (type == 0) {
            System.out.println("ffmpeg可以转换,统一转为mp4文件");
            status = processVideoFormat(sourceVideoPath, targetExtension);//可以指定转换为什么格式的视频

        }
        return status;   //执行完成返回布尔类型true
    }

    /**
     * 检查文件类型
     *
     * @return
     */
    private int checkContentType() {

        //取得视频后缀-
        String type = sourceVideoPath.substring(sourceVideoPath.lastIndexOf(".") + 1, sourceVideoPath.length()).toLowerCase();
        System.out.println("源视频类型为:" + type);

        // 如果是ffmpeg能解析的格式:(asx，asf，mpg，wmv，3gp，mp4，mov，avi，flv等)
        if (type.equals("avi")) {
            return 0;
        } else if (type.equals("mpg")) {
            return 0;
        } else if (type.equals("wmv")) {
            return 0;
        } else if (type.equals("3gp")) {
            return 0;
        } else if (type.equals("mov")) {
            return 0;
        } else if (type.equals("mp4")) {
            return 0;
        } else if (type.equals("asf")) {
            return 0;
        } else if (type.equals("asx")) {
            return 0;
        } else if (type.equals("flv")) {
            return 0;
        } else if (type.equals("mkv")) {
            return 0;
        }
        System.out.println("上传视频格式异常");
        return 9;
    }


    /**
     * 转换为指定格式
     * ffmpeg能解析的格式：（asx，asf，mpg，wmv，3gp，mp4，mov，avi，flv等）
     *
     * @param oldfilepath
     * @param targetExtension 目标格式后缀名 .xxx
     * @return
     */
    private boolean processVideoFormat(String oldfilepath, String targetExtension) {

        System.out.println("调用了ffmpeg.exe工具");

        //先确保保存转码后的视频的文件夹存在
        File TempFile = new File(targetFolder);
        if (TempFile.exists()) {
            if (TempFile.isDirectory()) {
                System.out.println("该文件夹存在。");
            } else {
                System.out.println("同名的文件存在，不能创建文件夹。");
            }
        } else {
            System.out.println("文件夹不存在，创建该文件夹。");
            TempFile.mkdir();
        }

        List<String> commend = new ArrayList<String>();

        commend.add(ffmpegPath);         //ffmpeg.exe工具地址
        commend.add("-i");
        commend.add(oldfilepath);            //源视频路径

        commend.add("-vcodec");
        commend.add("h263");  //
        commend.add("-ab");        //新增4条
        commend.add("128K");      //高品质:128 低品质:64
        commend.add("-acodec");
        commend.add("mp3");      //音频编码器：原libmp3lame
        commend.add("-ac");
        commend.add("2");       //原1
        commend.add("-ar");
        commend.add("22050");   //音频采样率22.05kHz
        commend.add("-r");
        commend.add("29.97");  //高品质:29.97 低品质:15
        commend.add("-c:v");
        commend.add("libx264");    //视频编码器：视频是h.264编码格式
        commend.add("-strict");
        commend.add("-2");
        commend.add(targetFolder + fileRealName + targetExtension);  // //转码后的路径+名称，是指定后缀的视频

        //打印命令
        StringBuffer test = new StringBuffer();
        for (int i = 0; i < commend.size(); i++) {
            test.append(commend.get(i) + " ");
        }
        System.out.println("ffmpeg输入的命令:" + test);

        try {
            //多线程处理加快速度-解决rmvb数据丢失builder名称要相同
            ProcessBuilder builder = new ProcessBuilder();
            builder.command(commend);
            Process p = builder.start();   //多线程处理加快速度-解决数据丢失

            final InputStream is1 = p.getInputStream();
            final InputStream is2 = p.getErrorStream();
            new Thread() {
                public void run() {
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(is1));
                    try {
                        String lineB = null;
                        while ((lineB = br.readLine()) != null) {
                            if (lineB != null)
                                System.out.println(lineB);    //打印mencoder转换过程代码
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            new Thread() {
                public void run() {
                    BufferedReader br2 = new BufferedReader(
                            new InputStreamReader(is2));
                    try {
                        String lineC = null;
                        while ((lineC = br2.readLine()) != null) {
                            if (lineC != null)
                                System.out.println(lineC);    //打印mencoder转换过程代码
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();

            p.waitFor();        //进程等待机制，必须要有，否则不生成mp4！！！
            System.out.println("生成mp4视频为:" + videoFolder + fileRealName + ".mp4");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
