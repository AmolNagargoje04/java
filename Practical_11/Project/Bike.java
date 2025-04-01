/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Java.Project;

/**
 *
 * @author amol
 */
public class Bike extends Vehicle{
    
     public int cubic_centimetres;

    public int getCubic_centimetres() {
        return cubic_centimetres;
    }

    public void setCubic_centimetres(int cubic_centimetres) {
        this.cubic_centimetres = cubic_centimetres;
    }

    

    public Bike(int cubic_centimetres, String brand, int speed) {
        super(brand, speed);
        this.cubic_centimetres = cubic_centimetres;
    }
    
    
    
}
