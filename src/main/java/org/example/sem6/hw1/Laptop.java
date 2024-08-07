package org.example.sem6.hw1;

import java.util.Arrays;

public class Laptop {
    String model;
    int hdd;
    int ram;
    String os;
    String color;
    double diagonal;

    public Laptop(String model, int hdd, int ram, String os, String color, double diagonal){
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.color = color;
        this.diagonal = diagonal;
    }
    public int getHdd(){
        return hdd;
    }
    public int getRam(){
        return ram;
    }
    public String getOs(){
        return os;
    }
    public String getColor(){
        return color;
    }
    public double getDiagonal(){
        return diagonal;
    }

    @Override
    public String toString() {
        return "Ноутбук: {" +
                "Производитель: " + model + '\'' +
                ", Жесткий диск: " + hdd +
                ", Объем оперативной памяти: " + ram +
                ", Операционная система: " + os + '\'' +
                ", Цвет: " + color + '\'' +
                ", Диагональ: " + diagonal +
                '}';
    }
}
