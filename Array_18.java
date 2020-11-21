/*


Share
Prakash is bored and wants to spends his time. He starts rolling a 
die and observes the value that is shown. He rolls the dice N times 
and observes that just one number appears distinctly, all the others 
get repeated or does not appear at all. Find out which was the number 
that puzzled Prakash for sometime, after which he realised that it was just a coincidence.

Constraints
============
0 <   N  <= 100
0 <= A[i] <= 100
 

Input Description:
==================
The first line contains a positive integer N, denoting the 
size of the array. The second line contains N positive integers, 
denoting the face values that appeared when the die was rolled.

Output Description:
===================
Print out the singly occurring number.

Sample Input :
==============
5
1 1 2 5 5

Sample Output :
===============
2

Input:
======
10
2 3 4 5 2 3 4 5 1 2

Expected Output:
================
1

*/
import java.util.Scanner;
class Array_18 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
      int count=0;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j] && a[j]!=-1){
					a[j]=-1;
               count++;
				}
			}
         if(count>0){
            a[i]=-1;
         }
         count=0;
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=-1){
				System.out.print(a[i]);
			}
		}
	}
}
