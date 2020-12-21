/*

Ram is the CEO of an MNC. He wants to order the employee salaries 
in ascending order so that he can do a salary hike based on the 
salary values of employees. He selects you to do the task of sorting
the salaries. Sort the salaries in ascending order and pass on the information to Ram.
 

Input Description:
==================
Number of employees followed by the salaries of employees.

Output Description:
===================
Salaries sorted in ascending order.

Sample Input :
==============
8
7000 8000 6500 1200 4000 2800 3000 5230

Sample Output :
===============
1200 2800 3000 4000 5230 6500 7000 8000

*/
import java.util.Scanner;
class Array_30 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			if(a.length-1==i){
				System.out.print(a[i]);
			}
			else{
				System.out.print(a[i]+" ");
			}
		}
	}
}
