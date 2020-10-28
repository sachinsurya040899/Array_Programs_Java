//Program to print non-unique numbers in array if all are unique print -1
import java.util.Scanner;
class Array3 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int count=0;
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					b[count]=a[i];
					count++;
				}
			}
		}
		if(count==0){
			System.out.print("-1");
		}
		else{
			for(int i=0;i<b.length;i++){
				if(i==count-1 && b[i]!=0){
					System.out.print(b[i]);
				}
				else if(b[i]!=0){
					System.out.print(b[i]+" ");
				}
			}
		}
	}
}
