/*

Input Description:
==================
Number of employees followed by their name and salary

Output Description:
===================
Sorted list of employee names

Sample Input :
===============
3
Karthik 23000 rohan 81734 varshini 12343

Sample Output :
===============
varshini
Karthik
Rohan

*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Array9 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		ArrayList s=new ArrayList();
		int n=sa.nextInt();
		while(n!=0){
			s.add(sa.next());
			s.add(sa.nextInt());
			n--;
		}
		for(int i=1;i<=s.size();i=i+2){
			for(int j=i+2;j<=s.size();j=j+2){
				int a=(int)s.get(j);
				int a1=(int)s.get(i);
				if(a<a1){
					Collections.swap(s,i,j);
					Collections.swap(s,i-1,j-1);
				}
			}
		}
		for(int i=0;i<s.size();i=i+2){
			System.out.println(s.get(i));
		}
	}
}
