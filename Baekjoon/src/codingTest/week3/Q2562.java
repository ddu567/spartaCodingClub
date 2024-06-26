package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[9];
        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
