/*

Given a sentence and string S, find how many times S occurs
in the given sentence.If S is not found in the sentence print -1

Input Size : |sentence| <= 1000000(complexity O(n)).

Sample Testcase :
==================
INPUT
=====
I enjoy doing codekata
codekata

OUTPUT
======
1

*/
import java.util.Scanner;
class Array_19 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String seq=sa.nextLine();
		String str=sa.next();
		String s[]=seq.split(" ");
		int count=0;
		for(int i=0;i<s.length;i++){
			if(str.equals(s[i])){
				count++;
			}
		}
		if(count>0){
			System.out.print(count);
		}
		else{
			System.out.print("-1");
		}
	}
}
