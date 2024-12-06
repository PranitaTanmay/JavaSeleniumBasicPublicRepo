package Strings;

public class Anagram {
    public static void main(String args[])
    {
        String str1="mary";
        String str2="myui";
        int length1=str1.length();
        int length2=str2.length();
        boolean flag=true;
        if(length1==length2)
        {
            char[] char1=str1.toCharArray();
            for(char ch:char1)
            {
                if(!str2.contains(String.valueOf(ch)))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println("two strings are anagram");
            }
            else
            {
                System.out.println("NOT");
            }
        }
        else
        {
            System.out.println("String length NOT matching");
        }
    }
}
