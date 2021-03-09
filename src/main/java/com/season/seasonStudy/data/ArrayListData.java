package com.season.seasonStudy.data;


import org.springframework.util.ObjectUtils;

import java.util.ArrayList;

public class ArrayListData implements Data<ArrayList<String>>{

    ArrayList<String> data = new ArrayList<>();

    @Override
    public ArrayList<String> getData() {
        if (ObjectUtils.isEmpty(data)){
            initData();
        }
        return data;
    }

    private void initData(){
        data = new ArrayList<String>(){{
           add("a");
           add("b");
           add("c");
           add("d");
           add("e");
           add("f");
           add("g");
           add("h");
           add("i");
           add("j");
           add("k");
           add("l");
           add("m");
           add("n");
           add("o");
           add("p");
           add("q");
           add("r");
           add("s");
           add("t");
           add("u");
           add("w");
           add("x");
           add("y");
           add("z");
        }};
    }
}
