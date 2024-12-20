package org.example.day22.문자열;

import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}