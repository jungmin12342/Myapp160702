package com.hanbit.user.myapp160702;

import java.io.Serializable;

/**
 * Created by 1027 on 2016-07-09.
 */
public class Person implements Serializable {
    private String name;
    private String gender;
    private String orgi;
    public  Person(String name, String gender, String orgi){
        this.name = name;
        this.gender = gender;
        this.orgi = orgi;
    }

    @Override
    public String toString() {
        return String.format("이름 %s 성 %s 주소는 %s",name, gender,orgi);
    }
}