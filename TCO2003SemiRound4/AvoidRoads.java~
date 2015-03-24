import java.io.*;
import java.util.*;
public class AvoidRoads
{
		public static void main(String args[])
		{
			String [] bad={};
			System.out.println(numWays(35,31,bad));
		}
	
		public static long  numWays(int width, int height, String[] bad)
		{
			long mat[][]=new long[width+1][height+1];
			mat[0][0]=1;
			String bad_ar=Arrays.toString(bad);
			System.out.println(bad_ar);
			mat[0][0]=1;
			for(int col=0; col<=width; col++)
			{
				for(int row=0; row<=height; row++)
				{
					int prev_col=col-1;
					int prev_row=row-1;
					
					if(prev_col>=0)
					{
						String block1="["+prev_col+" "+row+" "+col+" "+row+",";
						String block2=", "+prev_col+" "+row+" "+col+" "+row+",";
						String block3=", "+prev_col+" "+row+" "+col+" "+row+"]";
						String block4="["+prev_col+" "+row+" "+prev_col+" "+row+"]";
						String block5="["+col+" "+row+" "+prev_col+" "+row+",";
						String block6=", "+col+" "+row+" "+prev_col+" "+row+",";
						String block7=", "+col+" "+row+" "+prev_col+" "+row+"]";
						String block8="["+col+" "+row+" "+prev_col+" "+row+"]";
						
						if (!(bad_ar.contains(block1)||bad_ar.contains(block2)||bad_ar.contains(block3)||bad_ar.contains(block4)
							||bad_ar.contains(block5)||bad_ar.contains(block6)||bad_ar.contains(block7)||bad_ar.contains(block8)	))
						{
							mat[col][row]+=mat[prev_col][row];
							System.out.println(""+col+" "+row+"left");
						}
							
					}
					if(prev_row>=0)
					{
						String block1="["+col+" "+prev_row+" "+col+" "+row+",";
						String block2=", "+col+" "+prev_row+" "+col+" "+row+",";
						String block3=", "+col+" "+prev_row+" "+col+" "+row+"]";
						String block4="["+col+" "+prev_row+" "+col+" "+prev_row+"]";
						String block5="["+col+" "+row+" "+col+" "+prev_row+",";
						String block6=", "+col+" "+row+" "+col+" "+prev_row+",";
						String block7=", "+col+" "+row+" "+col+" "+prev_row+"]";
						String block8="["+col+" "+row+" "+col+" "+prev_row+"]";
						
						if (!(bad_ar.contains(block1)||bad_ar.contains(block2)||bad_ar.contains(block3)||bad_ar.contains(block4)
							||bad_ar.contains(block6)||bad_ar.contains(block7)||bad_ar.contains(block8)||bad_ar.contains(block5)))
						{
							mat[col][row]+=mat[col][prev_row];
							System.out.println(""+col+" "+row+"down");
						}
					}
				
					
					
				}
			}
			return mat[width][height];
		}
		

}
