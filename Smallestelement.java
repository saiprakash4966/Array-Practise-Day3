package com.bl;

public class Smallestelement 
{
	public static void main(String[] args) 
	{
		
		int numbers[] = new int[]{12,53,33,88,13};
		int Smallnumber = numbers[0];
		for(int i=1; i< numbers.length; i++)
		{
		if(numbers[i] < Smallnumber)
		Smallnumber = numbers[i];
		
		}
		System.out.println("Smallest Number is : " +
		Smallnumber);
		
		}


}
