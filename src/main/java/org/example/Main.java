package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
    }


    public static boolean checkForPalindrome(String string){
        String plainText = string.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : plainText.toCharArray()){
            list.add(c);
        }

        while(list.size()>1){
            if (!list.pollFirst().equals(list.pollLast())){
                return false;
            }
        }
        return true;
    }


    public  static String convertDecimalToBinary(int x){

        LinkedList<Integer> result = new LinkedList<>();

        while (x > 0 ){
            int reminder = x % 2 ;
            result.addFirst(reminder);
            x = x/2;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int y : result){
            stringBuilder.append(y);
        }
        return stringBuilder.toString();

    }



}