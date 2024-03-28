package codingTest;

import java.io.*;
import java.util.HashMap;

public class Q27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄에 펼쳐진 카드의 개수
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> fruit = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
//            StringTokenizer split = new StringTokenizer(" "); // 사용해서 풀어보기
            int count = fruit.getOrDefault(split[0], 0);
            fruit.put(split[0], count + Integer.parseInt(split[1]));
        }


        if (fruit.containsValue(5)) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.close();
    }
}
