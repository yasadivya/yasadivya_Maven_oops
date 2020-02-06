package com.epam.task2;


import java.util.Arrays;
import java.util.Scanner;

public class Gift 
{
	String childname;
    int ts,tc;
    
    Gift(String childname,int ts,int tc)
    {
    	this.childname = childname;
        this.ts = ts;
        this.tc = tc;
    }
    public static int Count(chocolate[] c,int min,int max) 
    {
    	int count=0;
        for(int i=0;i<c.length;i++)
        	if(c[i].cost>=min && c[i].cost<=max) count+=c[i].number;
        return count;
    }
    public static void main(String args[]) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter count of children");
    	int n=sc.nextInt();
    	int total_sweets,total_c;
    	Gift[] gift=new Gift[n];
    	sweets[] sweet;
    	chocolate[] c;
    	String childname;
    	for(int i=0;i<n;i++)
    	{
    		System.out.println("Enter name of child");
    		childname=sc.next();
    		System.out.println("Enter total number of sweets for children");
    		total_sweets=sc.nextInt();
    		System.out.println("Enter total number of chocolates for children");
    		total_c=sc.nextInt();
    		sweet=new sweets[total_sweets];
    		c=new chocolate[total_c];
    		gift[i]=new Gift(childname,total_sweets,total_c);
    		int cost,weight,tw=0,num=0;
    		/*num denotes number of sweets of same type
    		 * example:total_sweets=2 like Rabri and Rasagulla
    		 * now num for Rabri is 3 means 3 Rabri
    		 * similarly num for Rasagulla is 2 means 2 Rasagulla
    		*/
    		System.out.println("Enter cost and weight and no.of sweets of same type");
    		for(int j=0;j<gift[i].ts;j++)
    		{
    			cost=sc.nextInt();
    			weight=sc.nextInt();
    			num=sc.nextInt();
    			sweet[j]=new sweets(num,cost,weight);
    			tw+=weight*num;
    		}
    		String type;
    		System.out.println("Enter cost,weight, type and no. of chocolates of same type");
    		for(int j=0;j<gift[i].tc;j++) 
    		{
    			cost=sc.nextInt();
    			weight=sc.nextInt();
    			type=sc.next();
    			num=sc.nextInt();
    			c[j]=new chocolate(num,cost,weight,type);
    			tw+=weight*num;
    		}
    		System.out.println("Total weight of child "+gift[i].childname+" is: "+tw);
    		System.out.println("Sort the chocolates by using one.\n 1.Cost 2.Weight 3.Number of choclates");
    		int option=sc.nextInt();
    		Arrays.sort(c,new sort(option));
    		System.out.println("After sorting..");

    		for(int j=0;j<total_c;j++)
    			System.out.println(c[j]);

    		//Finding candies using range

    		System.out.println("Enter cost range ");
    		int start=sc.nextInt();
    		int end=sc.nextInt();

    		System.out.println("Number of chocolates within the given range of price "+Count(c,start,end));
    	}
    	sc.close();
    }
}
