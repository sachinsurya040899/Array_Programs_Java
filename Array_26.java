/*

You are head incharge of sports activity in queue. Your task is to sort the
students height wise in line. But you can only swap students.Your task is to
determine the minimum possible swaps required to sort the students in queue 
according to heights

Input Description:
==================
You are given with number ‘n’ denoting number of students. Next line contains
n space separated integers denoting their height.

Output Description:
===================
Print the minimum number of swaps required to sort the students in line.

Sample Input :
==============
5
1 5 4 3 2

Sample Output :
===============
2

Input:
======
5
4 3 2 1

Expected Output:
================
2

*/
import java.util.Scanner;
class Array_26 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int number=0;
		int index=0;
		int res=0;
		for(int i=0;i<a.length;i++){
			try{
			a[i]=sa.nextInt();
			}
			catch(Exception e){

			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					index=j;
					number++;
				}
			}
			if(number!=0){
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
				res++;
			}
			number=0;
		}
		System.out.print(res);
	}
}
