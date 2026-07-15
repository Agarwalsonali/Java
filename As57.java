//q-7

import java.util.Scanner;
class word
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the paragraph: ");
		String para = sc.nextLine();
		
		System.out.println("Enter the word you want to count: ");
		String word = sc.nextLine().toLowerCase();
		
		para=para.toLowerCase();
		String[] words = para.split("[\\s\\p{Punct}]+");
		int count = 0;
		for(String w : words)
		{
			if(w.equals(word))
				count++;
		}
		System.out.println("The word '" + word + "' occurs " + count + " times in the paragraph. ");
	}
}