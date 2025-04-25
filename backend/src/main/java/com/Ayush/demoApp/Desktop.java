package com.Ayush.demoApp;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Component
@Primary
public class Desktop implements Computer {
    public void compile() {
        System.out.println("Compiling through computer...");
    }
}
