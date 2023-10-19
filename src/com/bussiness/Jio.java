package com.bussiness;

import java.util.Scanner;

public class Jio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter business type :");
        String string = sc.nextLine();
        GroupBussinessFactory gbf = new GroupBussinessFactory();
        Business obj = gbf.getInstance(string);
        obj.bussinessType();
        sc.close();
      
    }
}
