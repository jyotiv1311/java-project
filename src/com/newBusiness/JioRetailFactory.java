package com.newBusiness;

public class JioRetailFactory extends JioFactory{
    public Company createCompany(){
        return new JioRetail();
    }
}
