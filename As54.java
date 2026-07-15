//q-4

import java.util.Scanner;
class As54Test
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of email addresses that you want to read: ");
		int n=sc.nextInt();
		sc.nextLine();
		String emails[] = new String[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the email address" +i+ ": ");
			emails[i]=sc.nextLine();
		}
		    System.out.println("Emails satrting with capital letters: ");
		    for(String email : emails)
		    {
				if(isValidEmail(email) && Character.isUpperCase(email.charAt(0)))
				    System.out.println(email);
		    }
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
		