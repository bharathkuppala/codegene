import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
        String s="rrrrbbrrrrbbr";
        char[] ch=s.toCharArray();
        String res="";
        int count=0; int count1=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='r'){
                count++;
        }
            else if(ch[i]=='b')
            {
                count1++;
            }  
        }
            if(count > count1)
            {
                System.out.println("the painted color are:"+count1);
            }
        else
        System.out.println("the painted color are:"+count);
    }
}