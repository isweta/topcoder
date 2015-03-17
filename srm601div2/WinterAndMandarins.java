import java.util.*;
import java.io.*;

public class WinterAndMandarins
{
	public static void main(String args[])
	{
		int bags_ar[][]={{10, 20, 30},{4, 7, 4},{4, 1, 2, 3},{5, 4, 6, 1, 9, 4, 2, 7, 5, 6},{47, 1000000000, 1, 74}};
		int k_ar[]={2,3,3,4,2};
		for(int i=0; i<bags_ar.length; i++)
		{
			System.out.println(getNumber(bags_ar[i], k_ar[i]));
		}
			
	
	}

	public static int getNumber(int[] bags, int K)
	{
		Arrays.sort(bags);
		int window_size=K;
		int bags_size=bags.length;
		int min_diff=Integer.MAX_VALUE;
		for(int win_ind=0; win_ind<= bags_size-window_size; win_ind++)
		{
			int temp_diff=bags[win_ind+window_size-1]-bags[win_ind];
			if(temp_diff<min_diff)
				min_diff=temp_diff;
		}
		return min_diff;
	}
}


/*
Problem Statement
    	
It's winter time! Time to eat a lot of mandarins with your friends.

You have several bags with mandarins. You are given an int[] bags. For each i, the i-th element of bags represents the number of mandarins in the i-th bag. You are also given an int K. You want to choose exactly K bags and distribute them among you and your friends. To be as fair as possible, you want to minimize the difference between the chosen bag with most mandarins and the chosen bag with fewest mandarins. Return the smallest difference that can be achieved.

 
Definition
    	
Class:	WinterAndMandarins
Method:	getNumber
Parameters:	int[], int
Returns:	int
Method signature:	int getNumber(int[] bags, int K)
(be sure your method is public)
    
 
Constraints
-	bags will contain between 2 and 50 elements, inclusive.
-	Each element of bags will be between 1 and 1,000,000,000, inclusive.
-	K will be between 2 and N, inclusive, where N is the number of elements in bags.
 
Examples
0)	
    	
{10, 20, 30}
2
Returns: 10
There are three ways to choose two bags in this case: {10, 20}, {20, 30}, and {10, 30}. Both in the first case and in the second case the difference between the largest and the smallest number of mandarins is 10. In the third case the difference is 20. Thus, the smallest possible difference is 10.
1)	
    	
{4, 7, 4}
3
Returns: 3
2)	
    	
{4, 1, 2, 3}
3
Returns: 2
3)	
    	
{5, 4, 6, 1, 9, 4, 2, 7, 5, 6}
4
Returns: 1
4)	
    	
{47, 1000000000, 1, 74}
2
Returns: 27
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.




This problem was used for: 
       Single Round Match 601 Round 1 - Division II, Level One*/
