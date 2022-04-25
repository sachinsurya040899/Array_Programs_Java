/*
Given a number N and an array of N integers, print the minimum sum of the sub-array from the given array.
Input Size : N <= 100000
Sample Testcase :
INPUT
4
2 4 4 2
OUTPUT
2

*/

import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int a=0;
		int dec=0;
		int gt=100000;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();	
		}
		while(n>0 || dec!=arr.length){
			if(n>=1){
				for(int i=0; i<n;i++){
					if(i==0){
						sum=0;
					}
					sum=sum+arr[i];
				}
				if(sum<gt){
					gt=sum;
				}
				n--;
				a++;
			}
			else{
				for(int i=a-1;i>=dec;i--){
					if(i==a-1){
						sum=0;
					}
					sum=sum+arr[i];
				}
				if(sum<gt){
					gt=sum;
				}
				dec++;
			}
		}
		System.out.print(gt);
	}
}
