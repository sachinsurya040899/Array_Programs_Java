/*

Prakash is bored and wants to spends his time. He starts rolling a die 
(having the face values as 1, 2, 3, 4, 8, 15, 7, 9) and observes that some 
of the values keep repeating. Also while rolling n times, some face appear 
once only. Find the number on its face.

Constraints

0 <   N  <= 100

0 <= A[i] <= 100

 

Input Description:
==================
The first line contains a positive integer N, denoting the size of the array. 
The second line contains N positive integers, denoting the face values that 
appeared when the die was rolled.

Output Description:
===================
Print out the singly occurring number. print 0 if no numbers are repeating.

Sample Input :
==============
5
1 1 2 5 5

Sample Output :
===============
2

*/
import java.util.Scanner;
class Array_23 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count=0;
		int index=0;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
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
			if(count>0){
				a[i]=-1;
			}
			count=0;
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=-1){
				b[index]=a[i];
				index++;
			}
		}
		if(count>0){
			System.out.print("0");
		}
		else{
			for(int i=0;i<a.length;i++){
				if(b[i]!=0 && b[i+1]==0){
					System.out.print(b[i]);
				}
				else if(b[i]!=0){
					System.out.print(b[i]+" ");
				}
			}
		}
	}
}