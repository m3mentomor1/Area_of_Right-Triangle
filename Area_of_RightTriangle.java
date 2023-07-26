
/*  ------------------------------------------------------
 *	File Name: Area_of_Triangle.java
 *  ------------------------------------------------------
 *  Date Created: 01-21-2021
 *  ------------------------------------------------------
 *  Description:
 *  This program is a calculator that calculates the 
 *  area of a right-triangle based on the base and height 
 *  provided by the user.
 *  ------------------------------------------------------ */

import java.util.Scanner;

public class Area_of_RightTriangle
{
	public static void main(String[] args) 
    {
		/*
		 * Formula: 
		 * A = (base x height)/2
		 */
        Scanner basexheight = new Scanner(System.in); 

        System.out.println("Enter base: ");
		double base = basexheight.nextDouble();

        System.out.println("Enter height: ");
		double height = basexheight.nextDouble();

        basexheight.close();
		System.out.println("The area of the right-triangle is " + (base*height)/2 + " m^2");
	}

}
