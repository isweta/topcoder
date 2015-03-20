import java.util.*;
import java.io.*;

public class WinterAndCandies
{
	public static void main(String args[])
	{
		int type_ar[][]={{1,3,2},{1,1,2},{1,3,2,5,7,4,5,4},{1,1,2,2,3,3,4,4,5,5},{2}};
		
		for(int i=0; i<type_ar.length; i++)
		{
			System.out.println(getNumber(type_ar[i]));
		}
	}

	public static int getNumber(int[] type)
	{
		int count_type[]=new int[51];
		int max_type=0;

		for(int i=0; i<type.length; i++)
		{
			count_type[type[i]]++;
			if (type[i]>max_type)
				max_type=type[i];
		}
		int ways_k=1;
		int sum=0;
		for(int k=1; k<=max_type; k++)
		{
			int new_factor=count_type[k];
			if(new_factor==0)
				return sum;
			ways_k=ways_k*new_factor;
			sum+=ways_k;
		}
		return sum;

	}
			
	
	}