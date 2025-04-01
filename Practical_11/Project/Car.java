/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Java.Project;

/**
 *
 * @author amol
 */
public class Car extends Vehicle{
    
    public String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    

    public Car(String engineType, String brand, int speed) {
        super(brand, speed);
        this.engineType = engineType;
    }
    
    
}
