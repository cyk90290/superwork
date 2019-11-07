package com.example.lib;

public class homework7 {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);
        int inp,sum;

        System.out.println("input :");
         inp=scanner.nextInt();
         sum=0;
        for (int n=1;n<=inp;n++)
        {
            sum+=n;
        }
        System.out.println("Ans:"+sum);
    }
}
