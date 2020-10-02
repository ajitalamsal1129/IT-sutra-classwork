package src.com.ajita;

import java.util.Scanner;

public class Arrayage {
    //declare an array of type int
    int[] ages;
    public void getAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of people");
        int num = scan.nextInt();
        ages = new int[num];//(array)array holds n integer value
        System.out.println("Enter the ages");
        for (int i = 0; i < num; i++) {
            ages[i] = scan.nextInt();
        }
    }
    //Create a method to grt the largest value between aray elements
    public int getMax() {
        int max = ages[0];
        for (int i = 1; i < ages.length; i++)
        {
            if (ages[i] > max) {
                max = ages[i];
            }
        }
        return max;
    }
    //Create a methgod to get the average of the array elements
    public int getMin() {
        int min = ages[0];
        for (int i = 1; i < ages.length; i++)
        {
            if (ages[i] < min) {
                min = ages[i];
            }
        }
        return min;
    }
    //create a method to get the average of the array elements
    public float getAverage() {
        int sum = 0;
        for (int i=0;i<ages.length; i++){
            sum += ages[i];
        }
        return (float) sum / ages.length;
    }
    public static void main (String[]args){
        Arrayage ar=new Arrayage();
        ar.getAge();
        int max=ar.getMax();
        int min= ar.getMin();
        float avg=ar.getAverage();
        System.out.println("the oldest person age is:" +max);
        System.out.println("the youngest person age is:" +min);
        System.out.println("the average age is:" +avg);




    }

    }



