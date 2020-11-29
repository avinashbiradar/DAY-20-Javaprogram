package com.JavaPrograms;

import java.util.Scanner;

public class ShoppingCart {
	//constructor
	public ShoppingCart(int a)
	{
		
		Scanner s= new Scanner(System.in);
		
		switch(a)
		{
		case 1:System.out.println("Enter Quantity");
		       int qnty=s.nextInt();
			   Total(qnty ,50);
			break;
		case 2:System.out.println("Enter Quantity");
	       int qnty1=s.nextInt();
		   Total(qnty1 ,20);
			break;
		default:System.err.println("Invalid Option ");	
		}
		
	}
	public void Total(int qnty,int a)
	{
		int Totalamt=qnty*a;
		System.err.println("Total amount to be paid : "+Totalamt);
	}
	public static void main(String[] args)
	{
		  
	      System.out.println("1 . Nirma Sabun : 50 Rs");
	      System.out.println("2 . Biscut : 20 Rs");
	      System.out.println("Enter your option for the product");
	      Scanner s= new Scanner(System.in);
	      int a=s.nextInt();
	      ShoppingCart cart = new ShoppingCart(a);
	
	}

}
