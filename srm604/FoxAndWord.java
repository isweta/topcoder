import java.util.*;
import java.io.*;
public class FoxAndWord
{

	public static void main(String args[])
	{
		String ar[]={"aaaaa", "bbbbb"};
		System.out.println(howManyPairs(ar));
	}	

	public static int howManyPairs(String[] words)
	{
		int pair_count=0;
		for(int curr_wd_ind=0; curr_wd_ind<words.length-1; curr_wd_ind++)
		{
			String curr_wd=words[curr_wd_ind];
			for(int pair_wd_ind=curr_wd_ind+1; pair_wd_ind<words.length; pair_wd_ind++)
			{
				
				String pair_wd=words[pair_wd_ind];
				if(curr_wd.length()!=pair_wd.length())
					break;
				for(int b_start=1; b_start<curr_wd.length(); b_start++)
				{
					String pref_curr=curr_wd.substring(0, b_start);
					String suff_curr=curr_wd.substring(b_start);
					int suff_len=suff_curr.length();
					String pref_pair=pair_wd.substring(0, suff_len);
					String suff_pair=pair_wd.substring(suff_len);
					if(pref_curr.equals(suff_pair) && suff_curr.equals(pref_pair))
					{
						pair_count++;
						break;
					}
				}
			}

		}
		return pair_count;
	}
	

}
