package com.epam.task2;

public class chocolate extends sweets
{
	String type;
	chocolate(int number,int cost,int weight,String type)
	{
	 super(number,cost,weight);
	 this.type=type;
	}
	public  String toString()
	{
	  String str="Cost: "+this.cost+" Weight: "+this.weight+" Total_Number: "+this.number+"Type: "+this.type;
	  return str;
	}  

}
