import java.util.*;
public class BitwiseShifts {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a<<b);
        System.out.println(b<<a);
        System.out.println(a>>b);
        System.out.println(b>>a);
    }
}