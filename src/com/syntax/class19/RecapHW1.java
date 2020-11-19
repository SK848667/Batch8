package com.syntax.class19;

public class RecapHW1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */

double sumArray(double[] array){

double sum = 0;
    for (int i = 0; i < array.length-1; i++) {
        sum=sum+array[i];
    }
return sum;
}



}
