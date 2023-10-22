package com.newBusiness;
import java.util.Scanner;

public class JioMainCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter business  name you want to know : ");
        String input = sc.nextLine();
        Company obj = JioFactory.getInstance(input);
  obj.businessType();
  sc.close();
    }
}
