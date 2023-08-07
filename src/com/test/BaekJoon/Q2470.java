package com.test.BaekJoon;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Q2470
{
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        
        int N = sc.nextInt();
        String[] strs= br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(strs[i]);

        Arrays.sort(arr);

        int leftIndex = 0;
        int rightIndex = N - 1;
        int ansLeftIndex = leftIndex;
        int ansRightIndex = rightIndex;
        int ansAbs = Math.abs(arr[ansLeftIndex] + arr[ansRightIndex]);
        while (leftIndex < rightIndex) {
            int currentSum = arr[leftIndex] + arr[rightIndex];
            int currentAbs = Math.abs(currentSum);
            if (ansAbs > currentAbs) {
                ansAbs = currentAbs;
                ansLeftIndex = leftIndex;
                ansRightIndex = rightIndex;
            }
            if (currentSum > 0) rightIndex--;
            else leftIndex++;
        }
        System.out.println(arr[ansLeftIndex] + " " + arr[ansRightIndex]);
    }
}