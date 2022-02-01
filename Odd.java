package com.bl;

public class Odd
{
	public static void main(String[] args)
	{
		int  numbers[]  =new int[] {5,2,6,8,7};
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2!=0) 
			{
				System.out.println(numbers[i]+ "odd number");
			}
		}
	}

}
