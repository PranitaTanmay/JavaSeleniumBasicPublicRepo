package Strings;

public class FindNonRepeatingChar {
    public static void main(String args[])
    {
        String name="ttffggbuuiio";

        char[] ch=name.toCharArray();
        int count=0;
        boolean flag=false;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
            }
            if(count<=1)
            {
                System.out.println("FIRST NON repeating char is ::"+ch[i]);
                flag=true;
                break;
            }
            count=0;
        }
        if(!flag)
        {
            System.out.println("String contains all repetative characters");
        }
    }
}
