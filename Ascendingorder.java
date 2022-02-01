package com.bl;

public class Ascendingorder 
{
	public static void main(String[] args) 
	{
		
		int numbers[] = new int[]{12,53,33,88,13};
		int largenumber = numbers[0];
		for(int i=1; i< numbers.length; i++)
		{
		if(numbers[i] > largenumber)
		largenumber = numbers[i];
		
		}
		System.out.println("Largest Number is : " +
		largenumber);
		
		}

}
