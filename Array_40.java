/*

Write a code to get a integer n as input and calculate the smallest perfect power of 2 greater than n.

Input Description:
==================
A single line containing an integer,n.

Output Description:
===================
Print the smallest perfect power of 2 greater than n.

Sample Input :
==============
48

Sample Output :
===============
64

Input:
======
32

Expected Output:
================
64

Input:
======
255

Expected Output:
================
256

*/
import java.util.Scanner;
class Array_40 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int pow=1;
		for(int i=0;i<n;i++){
			pow=pow*2;
			if(pow>n){
				System.out.print(pow);
				break;
			}
		}
	}
}
