//Program for finding the same marks of student index
//First line has number of students and A's mark
//Second line has the other sudents marks then compare with the A's mark and print the index
import java.util.Scanner;
class Array6 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int a[]=new int[2];
		int count=0;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		int b[]=new int[a[0]];
		int c[]=new int[a[0]];
		for(int i=0;i<b.length;i++){
			b[i]=sa.nextInt();
		}
		for(int i=0;i<b.length;i++){
			if(a[1]==b[i]){
				c[count]=i;
				count++;
			}
		}
		if(count==0){
			System.out.print("-1");
		}
		else{
			for(int i=0;i<c.length;i++){
				if(c[i]==0);
				else if((c[i]!=0 && i==c.length-1) || (c[i]!=0 && c[i+1]==0)){
					System.out.print(c[i]);
				}
				else{
					System.out.print(c[i]+" ");
				}
			}
		}
	}
}
