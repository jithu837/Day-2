import java.util.*;
 public class Swapping1
 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=b;
       b=g;
       g=c;
       String res=String.format("After Swapping\nboy=%d\ngirl=%d",b,g);
       System.out.println(res);
    } 
 }
