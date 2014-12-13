public class IdentifyingWood
{
	public static void main(String args[])
	{
		System.out.println(check("absdefgh","asdf"));
		System.out.println(check("oxoxoxox","ooxxoo"));
		System.out.println(check("oxoxoxox","xxx"));
		System.out.println(check("qwerty","qwerty"));
		System.out.println(check("string","longstring"));
	}
	
	public static String check(String s, String t)
	{
		int s_ind=0;
		boolean substr_flag=true;
		int s_len=s.length();
		for(int t_ind=0; t_ind<=t.length()-1; t_ind++)
		{
			if(s_ind>s_len)
			{
				substr_flag=false;
				break;
			}
			String curr_char=""+t.charAt(t_ind)	;
			int curr_ind=s.indexOf(curr_char, s_ind);
		
			if(curr_ind==-1)
			{
				substr_flag=false;
				break;
			}
			else
			{
				s_ind=curr_ind+1;
			}
			
		}
		if(substr_flag==true)
				return "Yep, it's wood.";
		else
				return "Nope.";
		
	}

}

/*Problem Statement
    
We call a pair of Strings (s, t) "wood" if t is contained in s as a subsequence. (See Notes for a formal definition.)
 
Given Strings s and t, return the String "Yep, it's wood." (quotes for clarity) if the pair (s, t) is wood and "Nope." otherwise.
Definition
    
Class:
IdentifyingWood
Method:
check
Parameters:
String, String
Returns:
String
Method signature:
String check(String s, String t)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
256
Stack limit (MB):
256
Notes
-
String t is contained in string s as a subsequence if we can obtain t by removing zero or more (not necessarily consecutive) characters from s.
Constraints
-
s and t will consist only of lowercase English letters.
-
s and t will each be between 1 and 10 characters long, inclusive.
Examples
0)

    
"absdefgh"
"asdf"
Returns: "Yep, it's wood."

1)

    
"oxoxoxox"
"ooxxoo"
Returns: "Nope."

2)

    
"oxoxoxox"
"xxx"
Returns: "Yep, it's wood."

3)

    
"qwerty"
"qwerty"
Returns: "Yep, it's wood."

4)

    
"string"
"longstring"
Returns: "Nope."

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.*/
