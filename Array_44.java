/*

Given 2 numbers N,K followed by a sorted array of N elements, search and 
tell if an element K is present in the array.print 'yes' if element is present otherwise print 'no'.
Input Size : 1 <= N <= 1000000000000000(Do it in logN time complexity)
Sample Testcase :
INPUT
3 2
2 3 7
OUTPUT
Yes

*/
import java.util.*;
class Array_65 
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
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
	}
}
