import java.io.*;
public class encrupt 
{
     public static void main (String ard[])throws IOException
      {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str,w="";
	int i,x;
	char ch;
	System.out.println("enter a word");
	str=br.readLine();
	str=str.toUpperCase();
	x=str.length();
	for(i=0;i<x;i++)
	{
		ch=str.charAt(i);
		if(ch>='A'&&ch<='X')
			ch=(char)(ch+2);
		else
			ch=(char)(ch-26+2);
		w=w+ch;
	}
	System.out.println("the encrupted words\t"+w);
}
}

