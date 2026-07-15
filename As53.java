//q-3

import java.util.Scanner;
class binary
{
	public static void main(String ar[])
	{
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sc.close();
		if(!binarySequence(st))
			System.out.println("The sequence contains non-binary digits.");
		else
			System.out.println("The sequence is binary.");
	}
	public static boolean binarySequence(String st)
	{
		for(int i=0; i<st.length(); i++)
		{
		    if(st.charAt(i)!='0' && st.charAt(i)!='1')
				return false;
		}
		return true;
	}
}