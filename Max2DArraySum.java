package ArrayPrograms;
/*
This is a question from LeetCode:
Given an array nums of integer , return how many of them contain an even number of digits.
Example :
Input : arr={{1,2,4},
{2,3,5},
{2,1,6}}

Person 1= 1+2+4=7
Person 2= 2+3+5=10
Person 3= 2+1+6=8
Therefore , Person 2 is the richest.


Every row represent the accounts of particular person
and every column represents wealth in every particular account.

We have to check the sum of wealth of each person's account and find out the richest person.

*/

public class Max2DArraySum {
    public static void main(String[] args) {
        //Initializing the accounts 2D Array
        int [][] accounts={
                {1,2,4},
                {2,3,5},
                {2,1,6}
        };
        //Maximum Wealth value set to 0
        int max=0;
        //Iteration over the accounts 2D Array
        for (int i=0;i< accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum=sum+accounts[i][j]; //Addition of every elements of each row's column and storing it in sum
            }
            if(sum>max)// Checking of maximum value of each row
            {
                max=sum;
            }
        }
        System.out.println(max);



    }
}
