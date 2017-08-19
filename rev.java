import java.io.*;
import java.util.*;
public class rev {
    public static void main(String args[])
    {
        String str;
        Scanner s=new Scanner(System.in);
        str=s.next();
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
         System.out.println(sb);
        String st=sb.toString();
        char p[]=st.toCharArray();
        for(int i=0;i<st.length();i++)
        {
        if(p[i]=='a'||p[i]=='e'||p[i]=='i'||p[i]=='o'||p[i]=='u')
        {
       System.out.print("");
    }
    else
        {
            System.out.print(p[i]);
        }}}
}
