/*

Given an array of numbers and another number k. Find whether 
K exists and the number of time k repeats. If it does not exist just print no.
Input Size : |N| <= 1000000
Sample Testcase :
INPUT
5 3
3 3 4 4 7
OUTPUT
yes 2

*/
import java.util.*;
class Array_66 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			if(a[i]==k){
				count++;
			}
		}
		if(count!=0){
			System.out.print("yes "+count);
		}
		else{
			System.out.print("no");
		}
	}
}
