/*

Given a string S, print 2 strings such that first string 
containing all characters in odd position(s) and other containing all characters in even position(s).

Sample Testcase :
=================
INPUT
=====
XCODE

OUTPUT
======
XOE CD

*/
import java.util.Scanner;
class Array_28 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String str=sa.next();
		String s[]=str.split("");
		String even="";
		String odd="";
		String res="";
		for(int i=0;i<s.length;i++){
			if(i%2==0){
				even+=s[i];
			}
			else{
				odd=odd+s[i];
			}
		}
		res=even+" "+odd;          //Why even comes first means index position starts with 0
		System.out.print(res);
	}
}
