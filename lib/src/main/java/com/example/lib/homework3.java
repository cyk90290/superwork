package com.example.lib;

public class homework3 {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("Weight (kg):");
        double inp1=scanner.nextInt();

        System.out.println("Height (cm):");
        double inp2=scanner.nextInt();

        double Hei=inp2/100;
        double BMI=inp1/(Hei*Hei);

        System.out.println("Your B M I : "+BMI);
    }
}
