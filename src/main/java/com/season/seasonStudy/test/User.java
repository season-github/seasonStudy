package com.season.seasonStudy.test;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private int age;
    // 除了上面两个基本数据类型的属性，User还依赖Car
    private Car car;

}
