package Strings;

public class StringReverse {
    public static void main(String args[])
    {
        String str="tatu";
        char[] chr=str.toCharArray();
        for(int i=chr.length-1;i>=0;i--)
        {
            System.out.print(chr[i]);
        }
    }}
