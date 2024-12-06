package Strings;

public class CheckStringContainsDigit {
    public static void main(String args[])
    {
        String s="pranita2";
        boolean flag=false;
        char[] ch=s.toCharArray();
        for(char c:ch)
        {
            if(Character.isDigit(c))
            {
                flag=true;
                break;
            }

        }
        if(flag)
        {
            System.out.println("String contains digit");
        }
        else
        {
            System.out.println("NOT");
        }
    }
}
