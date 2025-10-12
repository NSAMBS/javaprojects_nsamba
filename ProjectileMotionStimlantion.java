/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectilemotionstimlantion;

/**
 *
 * @author nsamba
 */
import java.util.Scanner;
public class ProjectileMotionStimlantion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Constants
        final double g = 9.81; //Accelaration due to gravity(m/s)
        
        //User input
        System.out.print("Enter initial velocity(m/s):");
        double velocity = input.nextDouble();
       System.out.print("Enter lauch angle(degrees):");
       double angle = input.nextDouble();
       
       //Convert angles to radians
       double angleRad = Math.toRadians(angle);
       //calculations
       double timeofFlight = (2*velocity*Math.sin(angleRad))/g;
       double maxHeight = Math.pow(velocity*Math.sin(angleRad),2)/(2*g);
       double range = Math.pow(velocity,2)*Math.sin(2*angleRad)/g;
       
       //Output
       System.out.printf("\nTime of Flight:%.2f seconds\n", timeofFlight);
       System.out.printf("Maximum Height: %.2f meters\n", maxHeight);
       System.out.printf("Horizontal Range: %.2f meters\n", range);
       
        
    }
}
