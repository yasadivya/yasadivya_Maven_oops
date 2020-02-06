package com.epam.task2;

public class sweets
{
	int number,cost,weight;
	sweets(int no_of_sweets, int cost_of_sweet, int weight_of_sweet){
	this.number=no_of_sweets;
	this.cost=cost_of_sweet;
	this.weight=weight_of_sweet;
	}

	public  String toString() {
	String str=" Weight: "+this.weight+"cost: "+ this.cost+"Total Number: "+this.number;
	return str;
	}

}
