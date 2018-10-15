import java.util.Scanner;
 
public class InsertionSort 
{
    public static void insertion( int a[] )
    {
        int i, b,t;
        int len = a.length;
        
        for (i = 1; i< len; i++) 
        {
            b = i;
            t = a[i];    
            while (b > 0 && t < a[b-1])
            {
                a[b] = a[b-1];
                b = b-1;
            }
        a[b] = t;            
        }        
    }    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );
        int n;
        System.out.println("Enter number the limit");
        n = scan.nextInt();
        int a[] = new int[ n ];
        System.out.println("\nEnter the "+ n + " elements");
        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
          System.out.println("\nElements before sorting");        
        for (int i = 0; i < n; i++)
            System.out.print(a[i]+" ");            
        System.out.println();      
        insertion(a);
        System.out.println("\nElements after sorting");        
        for (int i = 0; i < n; i++)
            System.out.print(a[i]+" ");            
        System.out.println();                     
    }    
}
