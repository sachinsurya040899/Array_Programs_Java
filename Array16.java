/*

Joyal was given a sentence. His task is to delete the two words 
that comes together and print the sentence so that the words in the 
output sentence have distinct words compared to their adjacent words. 
If no words are present in the output sentence print -1

Input Description:
==================
You are given input string 'S'

Output Description:
===================
Print the all the words that are left in the string 's' 
so that the words in the output sentence have distinct words compared
to their adjacent words. Print -1 if no words are left

Sample Input :
==============
I am john cena cena john

Sample Output :
===============
I am

Input:
======
We love we love

Expected Output:
================
We love we love

*/
import java.util.Scanner;
class Array16 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String s=sa.nextLine();
		String s1[]=s.split(" ");
		boolean count=true;
		int len=s1.length;
		int len2=0;
		String a1[];
		while(count){
			for(int i=0;i<s1.length;i++){
				for(int j=i+1;j<s1.length;j++){
					if(s1[i].equals(s1[j])){
						s1[i]="-1";
						s1[j]="-1";
					}
					else if(j==i+1)
					{
						break;
					}
				}
			}
			len--;
			for(int k=0;k<s1.length;k++){
				if(s1[k]=="-1"){
					len2++;
				}
			}
			if(len==0){
				break;
			}
			if(len2>0){
				len2=0;
				for(int p=0;p<s1.length;p++){
					for(int j=p+1;j<s1.length;j++){
						if(s1[j]=="-1"){
							continue;
						}
						else if(s1[j]!="-1" && s1[j-1]=="-1"){
							p++;
							s1[p]=s1[j];
							s1[j]="-1";
							len--;
						}
						else{
							break;
						}
					}
				}	
			}
			
		}
		for(int i=0;i<s1.length;i++){
			if(s1[i]=="-1"){
				continue;
			}
			else if(s1.length-1==i || s1[i+1]=="-1"){
				System.out.print(s1[i]);
				break;
			}
			else{
				System.out.print(s1[i]+" ");
			}
		}
	}
}
