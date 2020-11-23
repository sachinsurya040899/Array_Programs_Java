/*

You are given an array of numbers. Print the least occurring element. 
If there is more than 1 element print all of them in decreasing order of their value.

Input Description:
==================
You are given a number ‘n’ denoting size of array. Next line contains n space separated numbers.

Output Description:
===================
Print the number as mentioned

Sample Input :
==============
9
1 6 4 56 56 56 6 4 2

Sample Output :
===============
2 1

Input:
======
16
1 2 3 4 5 6 7 7 6 5 4 3 2 0 5 6

Expected Output:
================
1 0

*/
import java.util.Scanner;
public class Array_20 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count=0;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<b.length;i++){
			b[i]=-1;	
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					count++;	
               a[j]=-1;
				}
				else if(a[i]==-1){
					count++;
				}
			}
			if(count==0){
				b[i]=a[i];
			}
			count=0;
		}
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if((b[i]<b[j]) && b[j]!=-1){
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++){
			if(b[i]!=-1 && b[i+1]==-1){
				System.out.print(b[i]);
			}
			else if(b[i]!=-1){
				System.out.print(b[i]+" ");
			}
		}
	}
}
