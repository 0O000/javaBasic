package org.example.codingTest.programmers;

import java.util.Arrays;

public class 최댓값1 {
    public static void main(String[] args) {
        //int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers = {10, 20, 33, 2, 14, 5, 65, 2};
        //정렬한 후,
        //맨 끝값 * 두번째 끝값
        Arrays.sort(numbers);
        int answer = 0;
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        System.out.println(answer);
    }
}
