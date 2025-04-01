/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Java.Project;

/**
 *
 * @author amol
 */
public class Truck extends Vehicle{
    
     public boolean hydraulic_Jack;

    public boolean isHydraulic_Jack() {
        return hydraulic_Jack;
    }

    public void setHydraulic_Jack(boolean hydraulic_Jack) {
        this.hydraulic_Jack = hydraulic_Jack;
    }
    
    

    public Truck(boolean hydraulic_Jack, String brand, int speed) {
        super(brand, speed);
        this.hydraulic_Jack = hydraulic_Jack;
    }
}
