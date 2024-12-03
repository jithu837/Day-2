import java.util.*;
public class EvenOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if ((a & 1) == 0)
        {
            String res=String.format("%d is even",a);
            System.out.println(res);
        }
        else
        {
            String res=String.format("%d is odd",a);
            System.out.println(res);

        }
    }
}