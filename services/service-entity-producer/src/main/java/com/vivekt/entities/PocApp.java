package com.vivekt.entities;

import org.springframework.util.StringUtils;

public class PocApp {
    public static void main(String[] args) {

        String msg = "we got you son of a b. now enjoy";
       msg = StringUtils.capitalize(msg);
        System.out.println(msg);
    }
}
