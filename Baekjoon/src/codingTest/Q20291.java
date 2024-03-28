package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 바탕화면에 있는 파일 개수
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            int index = name.indexOf(".");
            String str = name.substring(index + 1);
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        br.close();







    }
}
