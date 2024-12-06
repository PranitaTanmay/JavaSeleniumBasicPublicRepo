package Strings;

public class SwapTwoStrings {
    public static void main(String args[])
    {
        String st1="pranita";
        String s2="Mule";
        System.out.println("Before swap String are::");
        System.out.println("st1::"+st1);
        System.out.println("s2::"+s2);
         st1=st1.concat(s2);
        s2=st1.substring(0,st1.length()-s2.length());
        st1=st1.substring((s2.length()),(st1.length()));

        System.out.println("After swap String are::");
        System.out.println("st1::"+st1);
        System.out.println("s2::"+s2);
    }
}
