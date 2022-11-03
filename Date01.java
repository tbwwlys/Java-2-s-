package org.example.day20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        //1. 获取系统时间
        //2. 默认输出 国外格式
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日 hh:mm:ss E");
        String newTime = sdf.format(date);
        System.out.println(newTime);
        //3. 将一个格式化的 String 类型的时间 转化成Date
        String time = "2022年11月3日 13:45:56 星期四";
        Date newTime2 = sdf.parse(time);
    }
}
