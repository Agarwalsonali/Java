//q-2

import java.util.Scanner;
class wordCounter
{
	public static void main(String ar[])
	{
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sc.close();
		String[] words = st.split("\\s+");
		System.out.println("Total number of words: " +words.length);
	}
}
		