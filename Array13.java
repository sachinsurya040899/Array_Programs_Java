/*

In a world cup tournament,no of goals scored by each team is given to you. Your task is to calculate net goal rate of each team.

Net goal rate of team is calculated

 

No of goals(team)- sum of(no of goals by last 3 teams)

Input Description:
==================
You are given a number ‘n’.Next line contains n space separated numbers.

Output Description:
===================
Print the net goal rate of each team

Sample Input :
==============
5
95 85 75 12 11

Sample Output :
===============
-3 -13 -23 -86 -87

*/
import java.util.Scanner;
class Array13 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int sum=0;
		for (int i=0;i<a.length ;i++){
			a[i]=sa.nextInt();
		}
		for(int i=a.length-1;i>=a.length-3;i--){
			sum += a[i];
		}
		for(int i=0;i<a.length;i++){
			a[i]=a[i]-sum;
		}
/*
		for(int i : a){
			System.out.print(i+" ");
		} 
*/
		for(int i=0;i<a.length;i++){
			if(i==a.length-1){
				System.out.print(a[i]);
			}
			else{
				System.out.print(a[i]+" ");
			}
		}
	}
}
