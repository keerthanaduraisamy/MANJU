import java.util.*;
import java.io.*;
public class SumDigits{    
    public static void main(String args[])
      {
      Scanner sc=new Scanner(System.in);
      int n,i=0,count=0;
      System.out.println("enter the number ");
      n=sc.nextInt();
      int a[]=new int[100];
      while(i<=n)
      {
        
        a[i]=n%10;
        n=n/10;
        i++;
        count++;
        }
        System.out.println("the sum of digits "+count);
        }
        }
