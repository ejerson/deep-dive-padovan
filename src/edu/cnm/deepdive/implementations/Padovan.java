/**
 * 
 */
package edu.cnm.deepdive.implementations;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author edge26
 *
 */
public class Padovan implements Iterable<BigInteger> {
  
  
// private static final int DEFAULT_UPPER = -1;
//  
//  private final int upper;
//  
//  public Padovan() {
//    this(DEFAULT_UPPER);
//  }
//  
//  public Padovan(int upper) {
//    this.upper = upper;
//  }
  
  @Override
  public Iterator<BigInteger> iterator() {
    // return new FibIterator();
    
    // Anonymous class implementing the Iterator<BigInteger> interface.
    return new Iterator<BigInteger>() {
      
      private BigInteger lessTwo = BigInteger.ZERO;
      private BigInteger previous = BigInteger.ONE;
      private BigInteger current = BigInteger.ZERO;
      private int index = 0;
          
      @Override
      public boolean hasNext() {
        return true;
      }

      @Override
      public BigInteger next() {
        BigInteger next = lessTwo.add(previous);
        lessTwo = previous;
        previous = current;
        current = next;
        index++;
        return current;
      }

    };

  }
  
  // recursive implementation of Padovan Sequence
//public static int getPadovan(int p)
//{
//    if (p == 0 || p == 1 || p == 2)
//        return 1;
//    return (getPadovan(p - 2) + getPadovan(p - 3));
//}
////
  
    
//  public static void main(String[] args) {
//   
//   
////    System.out.println(Padovan());
//
//  }
//  
//  // I'm returning the sequence
//  // I need an arraylist to store 
//  
//  
//  public Padovan() {
//   
//  }

//  // this 
//  @Override
//  public Iterator<Integer> iterator() {
//  
//    return new Iterator<BigInteger>() {
//      int currentNumber = getPadovan(10);
//      
//      ArrayList<Integer> padovanSequence = new ArrayList<Integer>();
////      padovanSequence.add(currentNumber);
//      
//      System.out.println(currentNumber);
//      
//      while(padovanSequence.hasNext()) {
//        
//      }
//      
//      private BigInteger lessTwo = BigInteger.
//      private BigInteger previous = BigInteger.ONE;
//      private BigInteger current = BigInteger.ZERO;
//      private int index = 0;
//          
//      @Override
//      public boolean hasNext() {
//        return upper < 0 || index < upper;
//      }
//
//      @Override
//      public BigInteger next() {
//        BigInteger next = previous.add(current);
//        previous = current;
//        current = next;
//        index++;
//        return current;
//      }
  

//    };
//  }

 

}
