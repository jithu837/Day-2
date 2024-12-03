import java.util.*;
public class EqualOrNot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if ((a^b)==0)
        {
            System.out.println("Given numbers are Equal");
        }
        else{
            System.out.println("Given numbers are not Equal");
        }
    }
    
}