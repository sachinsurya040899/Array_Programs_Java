/*

Given a number N and 2 arrays A and B of sorted order of size N, print the common elements.
If it is not found print -1.

Input Size : 1 <= N <= 100000

Sample Testcase :
=================

INPUT
=====

5
1 1 1 1 1
1 2 3 4 5

OUTPUT
======
1

Input:
======

5
1 2 4 8 10
1 4 8 18 20

Expected Output:
================
1 4 8

*/
import java.util.Scanner;
class Array15 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		int index=0;
		int res=0;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<b.length;i++){
			b[i]=sa.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					b[j]=-1;
					c[index]=a[i];
				}
			}
			if(c[index]!=0){
				index++;
			}
		}
		for(int i=0;i<c.length;i++){
			if(i==c.length-1 && c[i]!=0){
				System.out.print(c[i]);
			}
			else if(c[i]!=0){
				if(c[i+1]==0){
					System.out.print(c[i]);
				}
				else{
					System.out.print(c[i]+" ");
				}
			}
			else{
				res++;
			}
		}
		if(res==c.length){
			System.out.print("-1");
		}
	}
}
