package Strings;

public class CountNumberOfWordsInString {
    public static void main(String args[])
    {
        String str="I am pranita mule";
        String [] words=str.split(" ");
        int count=0;
        for(String w:words)
        {
            count++;
        }
        System.out.println(count);
    }
}
