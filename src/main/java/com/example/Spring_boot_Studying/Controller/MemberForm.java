package com.example.Spring_boot_Studying.Controller;

import org.springframework.stereotype.Controller;


public class MemberForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}