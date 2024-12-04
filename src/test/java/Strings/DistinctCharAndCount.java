package Strings;

import java.util.ArrayList;

public class DistinctCharAndCount {
    public static void main(String args[])
    {
        String str="aabkb";
        char[] chr=str.toCharArray();
        ArrayList<Character> list=new ArrayList<Character>();
        for(int i=0;i<=chr.length-1;i++)
        {
            int count=0;
            if(!list.contains(chr[i]))
            {
                list.add(chr[i]);
                for(int j=0;j<=chr.length-1;j++)
                {
                    if(chr[i]==chr[j])
                    {
                        count++;
                    }
                }
                System.out.println("::Character::"+chr[i]+"::count::"+count);
            }

            count=0;
        }
    }
}
