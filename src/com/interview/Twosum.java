package com.interview;

/*
An array and the target sum will be given. Method has to return two indices of numbers which makes sum of target.
1. loop on the size of the given array and set the complement with the differnce of target and first element in the array.
2. loop again with the size of the array with another variable and if both the indices are same then continue so, that the loop iterates again.
3. When both the indices are not equal, then it checks for the value of second index and complement based on that it returns the indices of two numbers.
 */

public class Twosum {

    public static int[] twoSum(int[] arr, int target){

        int complement;
        for(int x=0;x<arr.length;x++){

            complement=target-arr[x];

            for (int y=0;y<arr.length;y++){
                if(x==y){
                    continue;
                }
                if(arr[y]==complement){
                    return new int[]{x,y};
                }


            }
        }

        return  new int[]{0,0};


    }


    public static void main(String[] args) {


        int[] arr ={2,3,4,5,8};
        int target=8;
        int[] a1= twoSum(arr,target);
        for(int i : a1){
            System.out.println(arr[i]);
        }

    }
}
