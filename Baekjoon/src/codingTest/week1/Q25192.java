package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
// 못 풀었음
public class Q25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> list = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            list.put(name, list.getOrDefault(name, 0) + 1);

        }
    }
}
