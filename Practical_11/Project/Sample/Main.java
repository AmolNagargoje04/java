/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Java.Project.Sample;


import com.example.Java.Project.Bike;
import com.example.Java.Project.Car;
import com.example.Java.Project.Truck;

/**
 *
 * @author amol
 */
public class Main {
       public static void main(String[] args){
          Car c1 = new Car("Petrol", "Bentley", 335);
        System.out.println(c1.getEngineType() + " " + c1.brand  + " " + c1.speed);
        
        Bike b1 = new Bike(600, "Benelli", 225);
        System.out.println(b1.brand + " " + b1.getSpeed() + " " + b1.cubic_centimetres);
        
        Truck t1 = new Truck(true, "Bharat Benz", 80);
        System.out.println(t1.brand + " " + t1.hydraulic_Jack + " " + t1.getSpeed());
       };
    
}
