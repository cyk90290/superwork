package com.example.lib;

public class homework5 {
    public  static  void main(String[] avrg) {
        int hu1,min1,sec1,hu2,min2,sec2;
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("input Hour1 :");
         hu1=scanner.nextInt();

        System.out.println("input Minute1 :");
         min1=scanner.nextInt();

        System.out.println("input Second1 :");
         sec1=scanner.nextInt();

        System.out.println("input Hour2 :");
         hu2=scanner.nextInt();

        System.out.println("input Minute2 :");
         min2=scanner.nextInt();

        System.out.println("input Second2 :");
         sec2=scanner.nextInt();

        int allsec1=(hu1*3600)+(min1*60)+sec1;
        int allsec2=(hu2*3600)+(min2*600)+sec2;

        System.out.println("Ans:"+Math.abs(allsec1-allsec2));
    }
}
