import java.util.*;
import java.io.*;

public class TypoCoderDiv2
{
	public static void main(String args[])
	{
		int ques_ar[][]={{1000,1200,1199},{1500,2200,900,3000},{600,700,800,900,1000,1100,1199},{0,4000,0,4000,4000,0,0},{575,1090,3271,2496,859,2708,3774,2796,1616,2552,3783,2435,1111,526,562}};
		
		
		for(int i=0; i<ques_ar.length; i++)
		{
			System.out.println(count(ques_ar[i]));
		}
	}

	public static int count(int [] rating)
	{
		//0 means ciel 1 means brown
		int curr=0;
		int no_chng=0;
		for(int i=0; i<rating.length; i++)
		{
			int temp_curr;
			if(rating[i]<1200)	
				temp_curr=0;
			else
				temp_curr=1;
			if(curr!=temp_curr)
			{
				no_chng++;
				curr=temp_curr;
			}
		}
		return no_chng;
	}	
	
	}