/*

Given 2 strings S1 and s2, check whether they are case senitively equal without 
using any predefined function(case sensitive).If they are not same print 'no'

Sample Testcase :
INPUT
guvi guvi
OUTPUT
yes

*/
import java.util.*;
class Array_63
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int len1=s1.length();
		int len2=s2.length();
		if(len1!=len2){
			System.out.print("no");
		}
		else{
			int count=0;
			for(int i=0;i<len1;i++){
				for(int j=0;j<len2;j++){
					if((int)s1.charAt(i)==(int)s2.charAt(j)){
						count++;
					}
				}
			}
			if(count==len1){
				System.out.print("yes");
			}
			else{
				System.out.print("no");
			}
		}
	}
}
