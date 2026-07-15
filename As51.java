//q-1

import java.util.Scanner;
class Email
{
	public static void main(String ar[])
	{
		System.out.println("Enter your email address: ");
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		sc.close();
		if(isValidEmail(email))
		{
			int atIndex = email.indexOf('@');
			String username = email.substring(0,atIndex);
			System.out.println("Username: " +username);
			
			boolean verifyDomain = email.endsWith("gmail.com");
			System.out.println("Contains 'gmail.com': " +verifyDomain);
		}
		else
			System.out.println("Invalid email address.");
	}
	
	public static boolean isValidEmail(String email)
	{
		int count=0;
		for(int i=0; i<email.length(); i++)
		{
			if(email.charAt(i)=='@')
				count++;
		}
		if(count>=2 || count==0)
		{
			System.out.println("Invalid email address. '@' should appear only once.");
			return false;
		}
		else
			return true;
	}
}
			