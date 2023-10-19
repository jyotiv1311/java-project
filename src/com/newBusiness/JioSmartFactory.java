package com.newBusiness;

public class JioSmartFactory extends JioFactory{
    public Company createCompany(){
        return new JioSmart();
    }
}
