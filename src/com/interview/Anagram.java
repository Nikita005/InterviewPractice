package com.interview;
/*

Program checks whether the string is anagram or not
Anagram : Each string should contain same characters.
Example 1:
str1 = "abbac"
str2 ="bbaac"
Output : true
Example 2: "hello"
str2= "ellohw"
Output : false


1. isAnagram() should have 2 string parameters.
2. length of two strings must be same.
3. create the int array with size of 26 (Total no.of alphabets)
4. loop with the string length and incerment the int array based on the character of str1
5. decrement the int array based on the characters of str2.
6. If the given str is anagram size of count array should be zero as both of them have same characters.
 */
public class Anagram {

        public static boolean isAnagram(String str, String anagram) {

            if(str.length()!=anagram.length()) {
                return false;
            }

            int[] counts = new int[26];

            for(int i=0;i<str.length();i++){
                counts[str.charAt(i)-'a']++; // sets the ASCII value of the alphabets by decreasing with ASCII value of "a" [0-25]
                counts[anagram.charAt(i)-'a']--;


            }

            for(int i : counts){  //if both strings are anagram counts[] should be zero because we are incrementing and decrementing the counts based on string characters.
                if(i!=0){
                    return false;
                }
            }

            return true;

        }

        public  static  void main(String args[]){
            Anagram an = new Anagram();
            String str1="abbbacb";
            String str2="bbbaacc";

            System.out.println(an.isAnagram(str1,str2));
        }



    }
