/**
   A class for executing binary searches through an array.
*/
public class BinarySearcher
{  
   private int[] a;
   /**
      Constructs a BinarySearcher.
      @param anArray a sorted array of integers
   */
   public BinarySearcher(int[] anArray)
   {
      a = anArray;
   }
   
   /**
      Finds a value in a sorted array, using the binary
      search algorithm.
      @param v the value to search
      @return the index at which the value occurs, or -1
      if it does not occur in the array
   */
   public int search(int v)
   {  
      int low = 0;
      int high = a.length - 1;
      int checks = 0;
      while (low <= high)
      {
         checks++;
         int mid = (low + high) / 2;
         int diff = a[mid] - v;
         System.out.println("Low is index " + low + " Mid is index " + mid + " High is index " + high);
         if (diff == 0) // a[mid] == v
         {
             System.out.println("Success: mid is the location of the target value!");
             System.out.println(checks + "checks were done.");
             return mid;
         }
         else if (diff < 0) // a[mid] < v
         {
            low = mid + 1;
            System.out.println("Eliminate left half.");
         }
         else
         {
            high = mid - 1;
            System.out.println("Eliminate right half.");
         }
      }
      System.out.println(checks + " checks were done.");
      System.out.println("High and Low are crossing each other.");
      return -1;
   }


}

