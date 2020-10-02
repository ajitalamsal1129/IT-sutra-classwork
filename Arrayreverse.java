package com.ajita;

public class Arrayreverse {
    //public static void main(String[] args) {//Array to print namews in reverse order
      //  int[] num = {1, 2, 3, 4, 5, 6,7};
           // for (int i=num.length-1; i>=0; i--){
            //    System.out.println(num[i]);
    public void reverse(int[]arr) {
        for (int j = (arr.length - 1); j >= 0; j--) {
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args){
        int[]sample_array={1,2,3,4,5,6};
        Arrayreverse myObj= new Arrayreverse ();
        myObj.reverse (sample_array);





            }

        }


