//Program to print the odd numbers in a given number
import java.util.Scanner;
class Array5 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int s[]={n};
		int a[]=new int[5];
		int count=0;
		while(s[0]!=0){
			int rem=s[0]%10;
			if(rem%2!=0){
				a[count]=rem;
				count++;
			}
			s[0]=s[0]/10;
		}
		if(count==0){
			System.out.print("-1");
		}
		else{
			for(int i=a.length-1;i>=0;i--){
				if(i==0 && a[i]!=0){
					System.out.print(a[i]);
				}
				else if(a[i]==0);
				else{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
