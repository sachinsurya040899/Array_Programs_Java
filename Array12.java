/*

You are given an array of numbers. Print the least occurring element. If there is more than 1 element print all of them in decreasing order of their value.

Input Description:
===================
You are given a number ‘n’ denoting size of array. Next line contains n space separated numbers.

Output Description:
===================
Print the number as mentioned

Sample Input :
==============
9
1 6 4 56 56 56 6 4 2
Sample Output :
===============
2 1

Sample Input :
==============
7
99 99 99 99 99 99 99

Sample Output :
===============
99

*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Array12 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int max=a.length;
		int b[]=new int[max];
		int count=0;
		int index=0;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<b.length;i++){
			b[i]=-1;
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count<=max){
				if(i>=1){
					if(b[index-1]!=a[i]){
					max=count;
					b[index++]=a[i];
				}
				}
				else if(i==0){
					max=count;
					b[index++]=a[i];
				}
			}
			count=0;
		}
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if((b[j]>b[i]) && (b[i]!=0)){
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++){
			if(b[i]!=-1){
				if(b[i+1]==-1){
					System.out.print(b[i]);
					break;
				}
				else{
					System.out.print(b[i]+" ");
				}
			}
		}
	}
}
