/*

Given a number N in decimal convert it into binary value.
Input Size : N <= 100000
Sample Testcase :
INPUT
5
OUTPUT
101

*/
import java.util.*;
class Array_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int no=8192;
		String ans="0";
		for(int i=no;i>=1;){
			if(n>=i){
				ans=ans+"1";
				n=n-i;
			}
			else{
				ans=ans+"0";
			}
			i=i/2;
		}
		no=0;
		for(int i=0;i<ans.length();i++){
			if(String.valueOf(ans.charAt(i)).equalsIgnoreCase("1")){
				no=i;
				break;
			}
		}
		ans=ans.substring(no,ans.length());
		System.out.print(ans);
	}
}
