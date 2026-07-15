//q-5

import java.util.Scanner;
class phone_IP
{
	public static void main(String ar[])
	{
		System.out.println("Enter the phone number: ");
		Scanner sc=new Scanner(System.in);
	    String pn=sc.nextLine();
		
		System.out.println("Enter the IP address: ");
		String IP=sc.nextLine();
		
		if(isValidPhoneNo(pn))
			System.out.println("Valid phone number.");
		else
			System.out.println("Invalid phone number.");
		
		if(isValidIP(IP))
			System.out.println("Valid IP address.");
		else
			System.out.println("Invalid IP address.");
	}
	public static boolean isValidPhoneNo(String st)
	{
		return st.matches("[6-9]\\d{9}");
	}
	public static boolean isValidIP(String st)
	{
		String[] parts = st.split("\\.");
		if(parts.length!= 4)
			return false;
		for(String part : parts)
		{
			int num = Integer.parseInt(part);
			if(num<0 || num>255)
				return false;
		}
		return true;	
	}
}
		