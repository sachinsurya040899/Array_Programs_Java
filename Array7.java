//Program to print the non dupilicate/non-redundant values of a string array
import java.util.*;
class Array7 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		String a[]=new String[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.next();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i].equals(a[j]) && a[i]!="-1" && a[j]!="-1"){
					a[j]="-1";
				}
			}
			if(i==a.length-1 && a[i]!="-1"){
				System.out.print(a[i]);
			}
			else if(a[i]!="-1"){
				System.out.print(a[i]+" ");
			}
		}
	}
}
