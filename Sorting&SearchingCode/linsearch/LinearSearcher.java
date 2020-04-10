/**
   A class for executing linear searches through an array.
*/
public class LinearSearcher
{   
   private int[] a;  
    
   /**
      Constructs the LinearSearcher.
      @param anArray an array of integers
   */
   public LinearSearcher(int[] anArray)
   {
      a = anArray;
   }

   /**
      Finds a value in an array, using the linear search 
      algorithm.
      @param v the value to search
      @return the index at which the value occurs, or -1
      if it does not occur in the array
   */
   public int search(int v)
   {  
      for (int i = 0; i < a.length; i++)
      {  
         System.out.println("Checking postion " + i);
         if (a[i] == v)
         {
            int checks = i + 1;
            System.out.println("Found in position " + i + " after checking " + checks + " times.");
            return i;
         }
      }
      System.out.println("Checked all " + a.length + " elements in array and target was not found!");
      return -1;
   }

}
