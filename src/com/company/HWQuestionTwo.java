package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 10/12/15.
 */
public class HWQuestionTwo
{
    public static int isHalf(ArrayList<Integer> input){
        double halfOfArray=Math.floor(input.size()/2);
        System.out.println(halfOfArray);
        int topNum = 0;
        int one=0, two=0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0, zero = 0;

        for (int i=0;i<input.size();i++)
        {
            if(input.get(i)==0)
            {
                zero++;
                if(zero > halfOfArray) topNum=0;
            }
            if(input.get(i)==1)
            {
                one++;
                if(one > halfOfArray) topNum=1;
            }
            if(input.get(i)==2)
            {
                two++;
                if(two > halfOfArray) topNum=2;
            }
            if(input.get(i)==3)
            {
                three++;
                if(three > halfOfArray) topNum=3;
            }
            if(input.get(i)==4)
            {
                four++;
                if(four > halfOfArray) topNum=4;
            }
            if(input.get(i)==5)
            {
                five++;
                if(five > halfOfArray) topNum=5;
            }
            if(input.get(i)==6)
            {
                six++;
                if(six > halfOfArray) topNum=6;
            }
            if(input.get(i)==7)
            {
                seven++;
                if(seven > halfOfArray) topNum=7;
            }
            if(input.get(i)==8)
            {
                eight++;
                if(eight > halfOfArray) topNum=8;
            }
            if(input.get(i)==9)
            {
                nine++;
                if(nine > halfOfArray) topNum=9;
            }
        }

        return topNum;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> nums= new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(9);
        nums.add(9);
        nums.add(9);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(9);
        nums.add(9);
        nums.add(9);
        nums.add(9);


        System.out.println(isHalf(nums));

    }
}
