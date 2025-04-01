/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Java.Project;

/**
 *
 * @author amol
 */
public class Vehicle {
    
     public String brand;
    public int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    
}
