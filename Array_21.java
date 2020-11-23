/*

You are given an array F of focal lengths of size f, F[0], F[1],...F[f-1]. 
You are asked to determine the indices of the elements from the biggest element to the smallest element.

Input Description:
==================
The first line contains an integer f. The next line contains f space 
separated integers F[i], (0 <= i <= f-1) Note: The elements of F[i] are pairwise distinct.

Output Description:
===================
Print f space separated integers, denoting the indices of the elements, from biggest element to smallest.

Sample Input :
==============
3
1 5 4

Sample Output :
===============
1 2 0

*/
import java.util.Scanner;
class Array_21 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i]<b[j]){
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				if(b[i]==a[j]){
					if(i==b.length-1){
						System.out.print(j);
					}
					else{
						System.out.print(j+" ");
					}
				}
			}
		}
	}
}
