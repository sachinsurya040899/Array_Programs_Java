/*

Shreya is a brilliant girl. She likes to memorize the numbers. 
These numbers will be shown to her. As an examiner develop 
an algorithm to test her memory.

 
CONSTRAINTS
============

1<=Y,N,T<=1000

Input Description:
==================
First line contains no. of test cases(Y). Next line contains a number N. Next line contains n space separated numbers Next line contains a number T denoting the number of questions asked from you regarding the given array. Next line contains T space separated numbers.

Output Description:
===================
Print the occurrence of each number if present else “NOT PRESENT”

Sample Input :
==============
10
1 1 1 2 2 2 3 8 9 7
5
1 2 3 0 5

Sample Output :
================
3 3 1 Not Present Not Present

*/

import java.util.Scanner;
class Array11 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			a[i]=sa.nextInt();
		}
		int t=sa.nextInt();
		int b[]=new int[t];
		for(int i=0;i<t;i++){
			b[i]=sa.nextInt();
		}
		for(int i=0;i<b.length;i++){
			for(int j=0;j<a.length;j++){
				if(b[i]==a[j]){
					count++;
				}
			}
			if(count>0){
				if(i==b.length-1){
					System.out.print(count);
				}
				else{
					System.out.print(count+" ");
				}
			}
			else{
				if(i==b.length-1){
					System.out.print("Not Present");
				}
				else{
					System.out.print("Not Present"+" ");
				}
			}
			count=0;
		}
	}
}
