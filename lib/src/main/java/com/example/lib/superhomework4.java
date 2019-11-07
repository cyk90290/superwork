package com.example.lib;

public class superhomework4 {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("input second (sec) :");
        int inp=scanner.nextInt();
        int hu=inp/3600;
        int Min=(inp%3600)/60;
        int sec=(inp%3600)%60;
        System.out.println("Hour:"+hu+"  Minute:"+Min+"  Second:"+sec);
    }
}
