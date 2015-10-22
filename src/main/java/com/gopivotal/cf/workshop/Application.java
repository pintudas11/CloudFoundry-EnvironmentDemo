package com.gopivotal.cf.workshop;

import org.springframework.boot.SpringApplication;

/**
 * Used to initialize the app when packaged as a JAR
 * @author kkrueger
 */
public class Application {

    public static void main(String[] args) {
        
        System.out.println("this is working");
        
        SpringApplication.run(Config.class, args);
    }
    
}
