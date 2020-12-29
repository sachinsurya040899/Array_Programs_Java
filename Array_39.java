/*

Given an array of N elements which follows either even number or odd number series.
There may exists at maximum 1 even number in the odd series or 1 odd number in the even 
series.Find the different number if exists otherwise print '-1'?
Input Size : |N| <= 100000

Sample Testcase :
=================
INPUT
=====
5
1 3 4 5 7

OUTPUT
======
4

Input:
======
5
1 3 5 7 9

Output:
=======
-1

Input:
======
5
1 2 4 6 8

Output:
=======
1


*/
import java.util.Scanner;
class Array_39 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int res=0;
		int count=0;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		if(n%2==0){
			for(int i=0;i<a.length;i++){
				if(a[i]%2!=0){
					res=a[i];
					count++;
				}
				if(count>1){
					for(int j=i;j>=0;j--){
						if(a[j]%2==0){
							res=a[j];
						}
					}
					break;
				}
			}
			if(res==0){
				System.out.print("-1");
			}
			else{
				System.out.print(res);
			}
		}
		else if(n%2!=0){
			for(int i=0;i<a.length;i++){
				if(a[i]%2==0){
					res=a[i];
					count++;
				}
				if(count>1){
					for(int j=i;j>=0;j--){
						if(a[j]%2!=0){
							res=a[j];
						}
					}
					break;
				}
			}
			if(res==0){
				System.out.print(-1);
			}
			else{
				System.out.print(res);
			}
		}
		else{
			System.out.print(-1);
		}
	}
}
