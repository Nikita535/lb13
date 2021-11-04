package com.company;
 import java.util.Date;
 import java.util.Calendar;
 import java.util.GregorianCalendar;
 import java.text.SimpleDateFormat;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //форматирование даты по шаблону день месяц год часы минуты секунды
        SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        Calendar TodayDate=new GregorianCalendar();

        System.out.println("Введите дату (день месяц год часы минуты секунды) ");

//        ввод пользовательской даты
        Calendar UserDate=new GregorianCalendar();
        UserDate.set(Calendar.DAY_OF_MONTH,sc.nextInt()-1);
        UserDate.set(Calendar.MONTH,sc.nextInt()-1);
        UserDate.set(Calendar.YEAR,sc.nextInt());
        UserDate.set(Calendar.HOUR,sc.nextInt());
        UserDate.set(Calendar.MINUTE,sc.nextInt());
        UserDate.set(Calendar.SECOND,sc.nextInt());

        //сравнение даты через before (true false)
        if (TodayDate.before(UserDate)){
            System.out.println(dateformat.format(TodayDate.getTime())+
                    " > "+dateformat.format(UserDate.getTime()));
        }else System.out.println(dateformat.format(TodayDate.getTime())+
                " < "+dateformat.format(UserDate.getTime()));


    }
}
