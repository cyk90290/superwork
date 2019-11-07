package com.example.lib;

import java.util.Scanner;

public class superhomework13 {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        System.out.println(":");
        char c = input.next().charAt(0);
        change(c);
    }
    private static void change(char c) {
        if(c>='A' && c<='Z'){
            c+=32;
            System.out.println((c));
        }else if(c>='a' && c<='z'){
            c-=32;
            System.out.println((c));
        }
    }
}

