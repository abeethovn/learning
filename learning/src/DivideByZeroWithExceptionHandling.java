    // Fig.   . : DivideByZeroWithExceptionHandling.java
     // Handling ArithmeticExceptions and InputMismatchExceptions.
 /*    import java.util.InputMismatchException;
     import java.util.Scanner;
  
     public class DivideByZeroWithExceptionHandling
     {
        // demonstrates throwing an exception when a divide-by-zero occurs
        public static int quotient( int numerator, int denominator )
           throws ArithmeticException
        {
           return numerator / denominator; // possible division by zero
        } // end method quotient
  
        public static void main( String[] args )
        {
           Scanner scanner = new Scanner( System.in ); // scanner for input
           boolean continueLoop = true; // determines if more input is needed
  
-------------------------------------------------------------------------------
changes in the branch one    
make some changes and see if the remote branch will change ...                                   
---------------------------------------------------------------------------------
              catch ( InputMismatchException inputMismatchException )          
              {                                                                
                 System.err.printf( "\nException: %s\n",                       
                    inputMismatchException );                                  
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

changed at 
3030303030303030303030303
30303030303030300303030
303030303030303003
303030303030

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
              System.out.println(                                           
                      "Prog cont here!!!!!!!!!!!" );
         } while ( continueLoop ); // end do...while                         
      } // end main
   } // end class DivideByZeroWithExceptionHandling*/

