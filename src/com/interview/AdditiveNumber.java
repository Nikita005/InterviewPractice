package com.interview;

import java.math.BigInteger;

public class AdditiveNumber {



    public boolean isAdditiveNumber(String num) {
        //num should have min length 3 to be an additive number.
        if (num.length() < 3) {
            return false;
        }

        // for any additive number the no.of additions will be length of num/2 times. Example if num =0112, two additions will takes place.
        //SO this loop iterates
        for (int i = 0; i <= num.length()/2; i++) {
            System.out.println(num.length()/2);

            if (num.charAt(0) == '0' && i > 0) {
                break;
            }
            BigInteger x1 = new BigInteger(num.substring(0, i + 1));
            //make sure remaining size is at least size of first and second integer.
            for (int j = i + 1; Math.max(i, j - (i + 1)) + 1 <= num.length() - j - 1 ; j++) {
                if (num.charAt(i + 1) == '0' && j > i + 1) {
                    break;
                }
                BigInteger x2 = new BigInteger(num.substring(i + 1, j + 1));
                if (isValid(num, j + 1, x1, x2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isValid(String num, int start, BigInteger x1, BigInteger x2) {
        if (start == num.length()) {
            return true;
        }
        BigInteger x3 = x1.add(x2);
        //if num starts with x3 from offset start means x3 is found. So look for next number.
        return num.startsWith(x3.toString(), start) && isValid(num, start + x3.toString().length(), x2, x3);
    }


    public static void main(String[] args) {
	// write your code here

        AdditiveNumber obj1=new AdditiveNumber();
        System.out.println(" Additive Number:" +obj1.isAdditiveNumber("0112"));

    }
}
