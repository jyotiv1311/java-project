package com.newBusiness;

import com.bussiness.Status;

public abstract class JioFactory {
    abstract Company createCompany();
    public static Company getInstance(String str){
        
        
         Status businessType = Status.valueOf(str.toUpperCase());
        JioFactory factory;
        switch(businessType){
            case JIORETAIL : factory = new JioRetailFactory(); break;
            case JIOSMART : factory =  new JioSmartFactory(); break;
            case JIOCINEMA : factory =  new JioCinemaFactory(); break;
            default : factory = null;
        }
        return factory.createCompany();
    }
}
