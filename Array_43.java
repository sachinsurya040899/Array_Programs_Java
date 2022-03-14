/*

Given an array print the number of subarrays that can be formed with it.
Input Size : N <= 100000
Sample Testcase :
INPUT
5
1 2 3 2 1
OUTPUT
15

*/
import java.util.*;
class Array_64
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				int temp=0;
				if(j==a.length-1){
					for(int z=0;z<a.length-1;z++){
						temp=a[i];
						a[i]=a[z];
						a[z]=a[i];
					}
					count++;
				}
				else{
					for(int z=0;z<a.length;z++){
						temp=a[i];
						a[i]=a[z];
						a[z]=a[i];
					}
					count++;
				}
			}
		}
		System.out.print(count);
	}//main
}//class
