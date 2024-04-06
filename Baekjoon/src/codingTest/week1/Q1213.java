package codingTest.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
// 못 풀었음
public class Q1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        br.close();
        HashMap<Character, Integer> list = new HashMap<>();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            list.put(name.charAt(i), list.getOrDefault(count, 0)+1);

        }
        if (count % 2 != 1 && count % 2 != 0) {

        }

    }
}
