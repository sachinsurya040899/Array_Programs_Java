/*

Given two strings S1 and S2. The task is to find if a string 'S2’' can be obtained by rotating 
another string 'S1’' by 2 places using Stack.

Input Description:
==================
The first line of the input contains the string S1. The second line of the input contains the string S2

Output Description:
===================
Print 1 if the string S2 can be obtained by rotating string S1 by two places else print 0.

Sample Input :
==============
amazon
azonam

Sample Output :
===============
1

*/
import java.util.Scanner;
class Array_34 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.next();
		String str1=sa.next();
		String cp=str1;
		String s[]=str.split("");
		for(int i=0;i<str.length();i++){
			int index=2;
			int in=i;
			while(index!=0){
				in--;
				index--;
			}
			if(i<2){
				s[s.length+in]=String.valueOf(str.charAt(i));
			}
			else if(s.length<=in){
				int rem=in-s.length;
				int ind=0;
				if(rem-1<0){
					ind=rem;
				}
				else{
					ind=rem-1;
				}
				s[ind]=String.valueOf(str.charAt(i));
			}
			else{
				s[in]=String.valueOf(str.charAt(i));
			}
		}
		String res=String.join("",s);
		if(cp.equals(res)){
			System.out.print("1");
		}
		else{
			System.out.print("0");
		}
	}
}
