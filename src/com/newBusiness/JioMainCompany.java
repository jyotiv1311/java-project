package com.newBusiness;
import java.util.Scanner;

import com.bussiness.Status;

public class JioMainCompany {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the company you want to know : ");
        String input = sc.nextLine().replace(" ","").replace("_","");
   
        Status businessType = Status.valueOf(input.toUpperCase());
        JioFactory factory;
        switch(businessType){
            case JIORETAIL : factory = new JioRetailFactory(); break;
            case JIOSMART : factory =  new JioSmartFactory(); break;
            case JIOCINEMA : factory =  new JioCinemaFactory(); break;
            default : System.out.println("invalid input or business does not exist");
            sc.close();
                return;
        }

        Company newCompany = factory.createCompany();
        newCompany.businessType();

        sc.close();
    }catch(IllegalArgumentException e){
        System.out.println(e);
    }
    
    }
}
