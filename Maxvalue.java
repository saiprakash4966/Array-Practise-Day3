package com.bl;

public class Maxvalue 
{

	
	public static void main(String[] args)
	{
	double[] myList = {2.5,5.5,8.2,6.9};
	// Print all the array elements
	for (int i = 0; i < myList.length; i++) {
	System.out.println(myList[i] + " ");
	}
	// Summing all elements
	double total = 0;
	for (int i = 0; i < myList.length; i++) {
	total += myList[i];
	}
	System.out.println("Total is " + total);
	// Finding the largest element
	double max = myList[0];
	for (int i = 1; i < myList.length; i++) {
	if (myList[i] > max) max = myList[i];
	}
	System.out.println("Max is " + max);
	}
}


