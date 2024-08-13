package ArrayPrograms;
/*Given an integer array nums find the subarray with the largest sum and return its sum
* Here we used Kadane's Algorithm*/
public class MaxSubArrSum {
    public static void main(String[] args) {
        //Initializing the Array
        int [] num={-2,1,-3,4,-1,2,1,-5,4};

        //Declaring MaxSum and sum as 0
        int MaxSum=0;
        int sum=0;

        //For loop for iterating over the array and keeps adding values into the sum.
        for(int i=0;i< num.length;i++)
        {
            sum=sum+num[i];  //sum+num[i] keeps storing in the sum variable for eg:sum=0+(-2) and so on..
            MaxSum=Math.max(MaxSum,sum);  //Math.max function helps to update the maximum value in MaxSum variable
            //If sum value is less than sum=0
            if(sum<0)
            {
                sum=0;
            }

        }

        //Printing the result.
        System.out.println("Max Sum of an SubArray is : "+MaxSum);

    }
}
