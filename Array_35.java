/*

Program to delete the number in an array and swap the remaining elements in the deleted number position

Input:
======
3
1 2 33
1

Output:
=======
2 33 0

*/
import java.util.Scanner;
class Array_35 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		int num=sa.nextInt();
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				a[i]=0;
				for(int j=i;j<a.length;j++){
					if(j==a.length-1){
						break;
					}
					else{
						if(j==0){
							int index=j;
							for(int k=1;k<a.length;k++){
								a[index++]=a[k];
								if(k==a.length-1){
									a[k]=0;
								}
							}
							break;
						}
						else{
							int index=j;
							for(int k=j+1;k<a.length;k++){
								a[index++]=a[k];
								if(k==a.length-1){
									a[k]=0;
								}
							}
							break;
						}
					}
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
