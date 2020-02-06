package com.epam.task2;

import java.util.Comparator;

public class sort implements Comparator<chocolate>
{
	int option;
	sort(int n)
	{
		this.option=n;
	}
	public int compare(chocolate c1,chocolate c2)
	{
		switch(option)
		{
		case 1:return c1.cost-c2.cost;
		case 2:return c1.weight-c2.weight;
		case 3:return c1.number=c2.number;
		}
		return 0;
	}

}
