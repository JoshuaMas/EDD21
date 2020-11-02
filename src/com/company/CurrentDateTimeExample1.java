package com.company;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class CurrentDateTimeExample1 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Joshua_Mas_Mayer"+dtf.format(now));
    }
}
