package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassCourse implements Serializable {
    String cover;

    String courseSetTitle;

    String title;

    int seq;

    int length;

}
