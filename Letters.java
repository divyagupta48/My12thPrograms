import java.io.*;
public class Letters {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int f=0,j=0,i,len;
		System.out.println("enter the sentence");
		s=br.readLine();
		len=s.length();
		s=s.toUpperCase();
		s=" "+s;
		for(i=0;i<len;i++)
		{
			char ch=s.charAt(i);
			char ch1=s.charAt(i+1);
			if(ch==ch1)
			{
				f=1;
				j++;
			}}
		if(f==1)
			System.out.println("double alphabets="+j);
		else
		System.out.println("no double alphabet");
		
	}

}
