package com.Ayush.demoApp;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Dev {
    @Autowired //field injection
    private Computer comp;

    // public Dev(Computer comp) {
    //     this.comp= comp;
    // }
    public void build() {
        comp.compile();
        System.out.println("Building the application...");
    }
}