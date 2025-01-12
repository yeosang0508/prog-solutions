package com.example.level2.p12951;

public class main {
}


class Solution {
    public String solution(String s) {

        String[] str = s.split(" ");

        String answer = "";

        for (int i = 0; i < str.length; i++) {
            String[] word = str[i].split("");

            if (str[i].equals(" ")) {
                answer += " ";
                continue;
            }

            String a = word[0].toUpperCase();

            for (int j = 1; j < word.length; j++) {
                a += word[j].toLowerCase();
            }

            answer += a + " ";
        }

        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }

        return answer.substring(0, answer.length()-1);
    }
}