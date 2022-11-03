package org.example.day20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        System.out.println("年月日时分秒 =" + ldt.getYear() + ldt.getMonth() + ldt.getDayOfMonth() );
        System.out.println("年月日 =" + ld.getMonthValue() + ld.getDayOfMonth());
        System.out.println("时分秒 =" + lt);
    }
}
