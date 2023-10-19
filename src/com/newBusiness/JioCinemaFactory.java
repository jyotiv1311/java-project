package com.newBusiness;

public class JioCinemaFactory extends JioFactory {
    public Company createCompany(){
        return new JioCinema();
    }
}
