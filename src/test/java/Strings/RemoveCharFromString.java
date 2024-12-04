package Strings;

public class RemoveCharFromString {
    public static void main(String args[])
    {
        String str="pranita";
        char c='a';
        String s1="";
        char[]chr=str.toCharArray();
        for(char ch:chr)
        {
            if(ch!=c)
            {
               s1+=ch;
            }
        }
        System.out.println(s1);
    }
}
