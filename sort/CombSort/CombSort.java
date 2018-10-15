// Combsort sort like Bubble SOrt but with a gap of 1.3 

class CombSort 
{ 
     
    int getNextGap(int gap) 
    { 
        // Shrink Factor == 1.3 
	
        gap = (gap*10)/13; 
        if (gap < 1) 
            return 1; 
        return gap; 
    } 
  
    // Func() to sort array using combsort

    void sort(int arr[]) 
    { 
        int n = arr.length; 
        int gap = n; 
  
        // swapped = true for first time so that loop run first time
	
        boolean swapped = true; 
          // Keep running while gap is more than 1 and last 
        // iteration caused a swap 
        while (gap != 1 || swapped == true) 
        { 
            gap = getNextGap(gap); 
  
            // Now swapped = false and check if a swap is needed or exit the
	    // loop as array is sorted
            swapped = false; 
   
            for (int i=0; i<n-gap; i++) 
            { 
                if (arr[i] > arr[i+gap]) 
                {  
                    int temp = arr[i]; 
                    arr[i] = arr[i+gap]; 
                    arr[i+gap] = temp; 
  
                    // if swapping is there make it as true to continue looping 
                    swapped = true; 
                } 
            } 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        CombSort ob = new CombSort(); 
        int arr[] = {17, 40, 1, -56, 3, 76, 23, -6, 5, 4}; 
        ob.sort(arr); 
  
        System.out.println("sorted array"); 
        for (int i=0; i<arr.length; ++i) 
            System.out.print(arr[i] + " "); 
  
    } 
} 
