import java.util.*;
import java.io.*;

public class MiddleCode
{
	public static void main(String args[])
	{
		String ques_ar[]={"word",
"aaaaa",
"abacaba",
"shjegr",
"adafaaaadafawafwfasdaa"
};
		
		for(int i=0; i<ques_ar.length; i++)
		{
			System.out.println(encode(ques_ar[i]));
		}
	}


		
	public static String encode(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		StringBuffer tb=new StringBuffer();
		while(sb.length()!=0)
		{
			if(sb.length()%2!=0)
			{
				char mid=sb.charAt(sb.length()/2);
				tb.append(mid);
				sb.deleteCharAt(sb.length()/2);


			}
			else
			{
				char mid1=sb.charAt(sb.length()/2);
				char mid2=sb.charAt(sb.length()/2-1);
				char small;
				int small_ind;
				if(mid1<mid2)
				{
					small=mid1;
					small_ind=sb.length()/2;
				}	
				else
				{
					small=mid2;
					small_ind=sb.length()/2-1;
				}
				tb.append(small);
				sb.deleteCharAt(small_ind);	

			}
		}
		return(tb.toString());
	}
	

	
}