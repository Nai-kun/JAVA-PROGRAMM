/******************************************************************************
Name: Ian Frederick B. Talania
Problem statement:Create a program that will ask for a  list of integers, find and display all even numbers from the end of the list. 

INPUT FORMAT
Each line of input begins with an integer N indicating the number of integer n that follow
which comprises a list. 

OUTPUT FORMAT 
All even numbers from the end of the list, each separated by a single space. 

------------------------------

SAMPLE INPUT
5 10 25 12 4 1

SAMPLE OUTPUT  
 4 12 10
 
 
date finished: January 4, 2024
*******************************************************************************/
import java.util.Scanner;
public class Arrayjava
{
	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		System.out.println("Input how many numbers you want to check if it's an even number: ");
		int numba = type.nextInt();
	
		
		int [] integers = new int [numba];
		
		System.out.println("Input an Integer:");
		for (int b = 0; b < numba; b++)
		{
		  System.out.print("Number." +(b+1) + " ");
		  integers[b]=type.nextInt();
		}
	
    	System.out.println("Identify even:");
    	for (int i = 0;i < numba; i++){
    	    if (integers[i]%2==0){
    	        System.out.print(integers[i] + ",");
    	    }
    	}
		
	}
}
