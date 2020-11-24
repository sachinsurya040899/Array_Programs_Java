/*

Given a number N and an array of N integers, find the sum of all the negative numbers in the array.
Input Size : N <= 100000

Sample Testcase :
=================
INPUT
=====
2
3 0

OUTPUT
======
0

*/
import java.util.Scanner;
class Array_22 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int sum=0;
		for (int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]<0){
				sum=sum+a[i];
			}
		}
		System.out.print(sum);
	}
}
