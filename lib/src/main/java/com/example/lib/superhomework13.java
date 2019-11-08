package com.example.lib;

import java.util.Scanner;

public class superhomework13 {
    public static void main(String[] argv) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        System.out.println("boy=1 girl=2");
        int sex =scanner.nextInt();
        int age =scanner.nextInt();
        if( sex==1 )
        {if (age>=18){
            System.out.println("You are marriageable.");
        }
        if( sex==1)
        {if (age<18)
            System.out.println( "You are NOT marriageable.");
        }}
        else if (sex==2)
        {{if (age>=16)
            System.out.println("You are marriageable.");
        }
        if( sex==2)
        {if (age<16)
            System.out.println( "You are NOT marriageable.");
        }}
        }}

