import java.util.*;
import java.io.*;
public class PowerNum{
  
  public static void main(String args[])
  {
    
    int n,i,p,result=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number ");
    n=sc.nextInt();
    p=sc.nextInt();
    if(n>=0 && p==0)
    {
     result=1;
     }
    else if(n==0 && p>=1)
     result =0;
     else
     {
    for(i=1;i<=p;i++)
    {
       result=result*n;
      }
      }
      System.out.println(" the power is :" +result);
      }
      }
