package String;

import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class ReverseOnlyAlphabet
{
    static void reverseAlphabet(char ch[])
    {
        int s=0;
        int e=ch.length-1;

        while(s<=e)
		{
			if(Character.isAlphabetic(ch[s]) && Character.isAlphabetic(ch[e]))
			{
				char c=ch[s];
				ch[s]=ch[e];                           
				ch[e]=c;
				s++;
				e--;
			}
			else if(Character.isAlphabetic(ch[s]) && !Character.isAlphabetic(ch[e]))
			{
				e--;
			}
			else if(!Character.isAlphabetic(ch[s]) && Character.isAlphabetic(ch[e]))
			{
				s++;
			}
			else
			{
				s++;
				e--;
			}
		}
		
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        char ch[]=s.toCharArray();

        reverseAlphabet(ch);
        
		for(char ele:ch)
		{
			System.out.print(ele);
		}
    }

}