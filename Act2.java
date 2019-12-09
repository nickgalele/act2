/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package act2;

/**
*
* @author it11614
*/
public class Act2
{
   public int sum(int x, int y)
   {
        for(int a = 1; a <= 5; ++a)
        {
           for(int b = 1; b <= a; ++b)
           {
               System.out.print("* ");
           }
           System.out.println();
           }
         for(int i=4; i >= 1; --i)
       {
           for(int j = 1; j <= i; ++j)
           {
           System.out.print("* ");
           }
           System.out.println();
       }
       return (0);
   }
   public int sum(int x, int y, int z)
   {
       int r = 5, i = 1, j = 1;
       
       while (i <= r)
       {
        while (j <= i )
        {
            System.out.print("* ");
            ++j;
        }
        System.out.print("\n");
        i++;
        j = 1;
       }
       int a = 4, b = 1;
       
       while (a >= 1)
       {
        while (b <= a)
        {
            System.out.print("* ");
            ++b;
        }
        System.out.print("\n");
        --a;
        b = 1;
       }
       
       return (0);
   }
   
   public double sum(double x, double y)
   {
       int i = 0, j = 0;
       do
    {
        do
            {
                System.out.print("*");
                j++;
            }
        while(j<=i);
        j=0;
        System.out.print("\n");
        i--;
    }
    while(i>=j);
    j=0; i=0;
    do
    {
        do
        {
            System.out.print("*");
            j++;
        }
        while(j!=i+1);
        j=0;
        i++;
        System.out.print("\n");
    }
    while(i!=5);
       return (0);
   }
   public static void main(String args[])
   {
       Act2 s = new Act2();
       System.out.println(s.sum(0,0));
       System.out.println(s.sum(0,0,0));
       System.out.println(s.sum(0,0,0));
   }
}
 