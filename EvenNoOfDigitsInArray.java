package ArrayPrograms;
/*
This is a question from LeetCode:
Given an array nums of integer , return how many of them contain an even number of digits.
Example :
Input : nums=[12,345,2,6,7896]
Output : 2

Explanation :
12 contains 2 digits - even number of digits
345 contains 3 digits - odd number of digits
2 contains 1 digit - odd number of digits
6 contains 1 digit - odd number of digits
7896 contains 4 digits - even number of digits

Therefore, 12 and 7896 are two numbers having even no of digits.


* */
public class EvenNoOfDigitsInArray {
    public static void main(String[] args) {
        //Initializing of the Array
        int[] nums={12,345,2,6,7896};

        //Calling the function and printing the result
        System.out.println("There are "+ FindNums(nums)+" numbers with even number of Digits");

    }

    //It is the main function to count the numbers with even no of digits.
    static int FindNums(int []nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++) //It iterates over every element in the array.
        {
            int num=nums[i]; //num element keeps storing the elements of array in it.

            if(EvenDigits(num))  //Calls the function to check if the number have even no of digits
            {
                count++; //Counts all the numbers having even no of digits
            }
        }

        return count;
    }

    //Check whether no of digits is even or not and returns true or false
    static boolean EvenDigits(int num)
    {
        int NumberOfDigits= CountNoOfDigits(num);
        if(NumberOfDigits%2==0) //Formula to check even or not
        {
            return true;
        }
        return false; //return false if the number is not even

    }

    //Count No. of Digits
    static int CountNoOfDigits(int num)
    {
        //Converts negative number into positive if present
        if(num<0)
        {
            num=num*-1;
        }
        //If the number is 0 it returns 0
        if(num==0)
        {
            return 0;
        }

        int count=0;  //Initially count is 0
        while(num>0)
        {
            num=num/10;
            count++;
        }
        return count;
    }
}
