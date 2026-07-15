//q-6

import java.util.Scanner;

class no_to_word
{
    private static final String ones[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private static final String tens[]={"","","tens","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    private static final String thousands[]={"","Thousands","Millions","Billions"};
    static String  number_to_word(int num)
    {
        if(num==0) return "zero";
        String word="";
        int i=0;
        while(num>0)
        {
            if(num %1000 !=0)
            {
                word=helperno_to_word(num %1000)+thousands[i] + " " + word;
            }
            num/=1000;
            i++;
        }
        return word.trim();   
    }
    private static String helperno_to_word(int num)
    {
        if(num==0) return "";
        else if(num<20)
        {
            return ones[num] + " ";
        }
        else if(num<100)
        {
            return tens[(num/10)+1] + helperno_to_word(num %10);
        }
        else
        {
            return ones[num /100] +" " + "hundred"+" " +helperno_to_word(num %100);
        }

    }
}
class q6
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your integer");
        int num=sc.nextInt();
       System.out.println(no_to_word.number_to_word(num));
    }
}