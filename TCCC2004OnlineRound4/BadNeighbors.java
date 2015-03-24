import java.util.*;
import java.io.*;

public class BadNeighbors
{
	public int maxDonations(int[] donations)
	{
		int size=donations.length;
		int [][] mat1=new int[size][2];
		int [][] mat2=new int[size][2];
		
		//calc mat1
		mat1[0][0]=0;
		mat1[0][1]=donations[0];
		for(int i=1; i<size; i++)
		{
			mat1[i][0]=(mat1[i-1][0]>mat1[i-1][1])?mat1[i-1][0]:mat1[i-1][1];
			mat1[i][1]=mat1[i-1][0]+donations[i];
		}
		///mat1[size-1][1]//not valid
		mat2[1][0]=0;
		mat1[1][1]=donations[1];
		for(int i=2; i<size; i++)
		{
			mat2[i][0]=(mat2[i-1][0]>mat2[i-1][1])?mat2[i-1][0]:mat2[i-1][1];
			mat2[i][1]=mat2[i-1][0]+donations[i];
		}
		
		int max=(mat1[size-1][0]>mat1[size-1][1])?mat1[size-1][0]:mat1[size-1][1];
		return max;
		
		
	}
}
