package ADS;
import java.io.*;
 
	class StrinReverse
	{
		public static void reverse(String str)
		{
			int n=str.length();
			Stack st =new Stack(n);
			for(int i=0;i<n;i++)
			{
				st.push(str.charAt(i));
			}
			while(st.isEmpty()==false)
			{
				char ch=(char)st.pop();
				System.out.print(ch+" ");
			}
		}
		
		public static void main(String[]args)
		{
			String str="Sairaj sachin sanket";
			reverse(str);
			
		}
	}