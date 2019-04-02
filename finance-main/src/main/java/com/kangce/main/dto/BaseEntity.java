package com.kangce.main.dto;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Getter;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    int a=0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
