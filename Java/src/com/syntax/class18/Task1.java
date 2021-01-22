package com.syntax.class18;

public class Task1 {
    public static void main(String[] args) {
        /*
1)Create a method that will accept an array as parameters and will return a sum of all elements from that array.
Method should be visibly only within same package and accessible by the creating an instance of the class.
         */

                int[] arr = {-100, -50, -1, 0, 1, 50, 100,};
                Task1 obj = new Task1();
                int sum = obj.getSum(arr);
                System.out.println(sum);
            }
            int getSum(int[] a){
                int sum = 0;
                for(int i = 0; i < a.length; i++){
                    sum+=a[i];
                }
                return sum;
            }
        }
