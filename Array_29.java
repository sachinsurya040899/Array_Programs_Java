/*

You are given an array of digits. Your task is to print the digit with maximum frequency.

Input Description:
==================
You are given length of array ’n’,next line contains n space separated numbers.

Output Description:
===================
Print the number with maximum frequency. If two number have equal freqency print
the number that comes first

Sample Input :
==============
7
1 2 3 4 4 4 5

Sample Output :
===============
4

Input:
======
11
97 86 97 86 95 32 16 97 97 86 45

Expected Output:
================
97

*/
import java.util.Scanner;
class Array_29 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int	n=sa.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		int index=0;
		int count=1;
		int max=0;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j] && a[i]!=-1){
					count++;
					a[j]=-1;
				}
			}
			b[i]=count;
			count=1;
		}
		for(int i=0;i<b.length;i++){
					if(max<b[i]){
						max=b[i];
					}
		}
		for(int i=0;i<c.length;i++){
			c[i]=-1;
		}
		for(int i=0;i<b.length;i++){
			if(b[i]==max){
				c[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<c.length;i++){
			if(c[i]!=-1){
				if(c[i+1]==-1){
					System.out.print(c[i]);
				}
				else{
					System.out.print(c[i]+" ");
				}
			}
		}
	}
}