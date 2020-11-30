/*

The prison warden at Central jail is given a tip-off that a prison 
inmate is planning an escape. The warden suspects a particular prisoner 
of planning an escape and wants to find out if he/she is present in his/her 
cell. The layout of the prison is modelled in a matrix with every cell of 
the matrix representing a prison cell. The matrix is filled with the prisoner
ids at the corresponding cells. Find out whether the person the warden suspects
is present in the prison or not.
 

Input Description:
==================
First line contains the dimensions of the prison matrix, followed by the 
ids of prisoners as elements of the matrix. The third line contains the id to be searched.

Output Description:
===================
(yes/no) whether the given element is present in the matrix or not.

Sample Input :
==============
2 5
2 3 0 7 1 5 3 4 1 8
11

Sample Output :
===============
no

*/
import java.util.Scanner;
class Array_24 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int n1=sa.nextInt();
		int a[][]=new int[n][n1];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sa.nextInt();
			}
		}
		int search=sa.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]==search){
					System.out.print("yes");
					count++;
					break;
				}
				if(count!=0){
					break;
				}
			}
		}
		if(count==0){
			System.out.print("no");
		}
	}
}
