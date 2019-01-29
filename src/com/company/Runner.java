package com.company;
/*
Chi Ho (Kyle) Tam
Catelen Wu
*/

public class Runner
{

    public static void main(String[] args)
    {
        int[] array1 = {50,50,20,80,53};
        int[] array2 = {20,50,50,53,80};
        int[] array3 = {20,50,50,80};

        StudentRecord one = new StudentRecord(array1);
        System.out.println(one.finalAverage());

        StudentRecord two = new StudentRecord(array2);
        System.out.println(two.finalAverage());

        StudentRecord three = new StudentRecord(array3);
        System.out.println(three.finalAverage());
    }
}
