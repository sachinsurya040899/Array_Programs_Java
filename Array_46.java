/*

Given a number N and an array of N elements, print the array after 
removing duplicate elements.If no duplicate elements found print the same.
Input Size : N <= 100000
Sample Testcase :
INPUT
4
2 4 4 2
OUTPUT
2 4

*/
import java.util.*;
class Array_67 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print(a[0]);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(i!=j){
					if(a[i]==a[j]){
						a[j]=-1000;
					}//if
				}//if
			}//for
			if(a[i]!=-1000 && i!=0){
				System.out.print(" "+a[i]);
			}
			else{
				continue;
			}
		}//for
	}//main
}//class
