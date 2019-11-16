package com.interview;

/*
Array, index will be given as parameters
For example arr={1,2,3,4,5,6,7}
index = 3
Output: 4,5,6,7,1,2,3
From the given index i.e, the numbers after the index including index should be shifted to left and the numbers before the index need to shifted to the end of the array
1. int[] and index are the parameters
2. create a  new array based on length of int[]
3. loop on length of the array and set the position with the looped "i" value and given index.
4. f the position is greater than or equals to zero, the element should be added to the next to the givwn index.
5. If position is less than 0, the eleemnts shoulf be added to the end of the array.
*/
public class ArrayLeftShift {

    private static void arrayLeftShift(int[] arr, int k) {
        int length= arr.length;
        int[] result = new int[length];
        int pos;

        for(int i=0;i<length;i++){

            pos=i-k;

            if(pos>=0){
                result[pos]=arr[i];
            }
            else {
                result[pos+length]=arr[i];

            }

        }
        for(int i : result){
            System.out.print(" " + i);
        }
        }


}
