package com.bussiness;

public class GroupBussinessFactory {

    public Business getInstance(String str) {
    String input = str.replace(" ","").replace("_","");
   
    Status businessType = Status.valueOf(input.toUpperCase());

    switch(businessType){
        case JIORETAIL : return new JioRetail();
        case JIOSMART : return  new JioSmart();
        case JIOCINEMA : return  new JioCinema();
        default : return null;
    }
       
}
}
