package Strings;

public class Palindrome {
    public static void main(String args[])
    {
        String str="madam1";
        String revStr="";
        char chr[]=str.toCharArray();
        for(int i=chr.length-1;i>=0;i--)
        {
            revStr+=chr[i];
        }
        if(str.equals(revStr))
        {
            System.out.println("String is palindrome::"+str);
        }
        else
        {
            System.out.println("String is NOT palindrome::");
        }
    }
}
