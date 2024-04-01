package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> list =new HashSet<>();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (list.contains(name)) {
                arr.add(name);
            }
        }
        br.close();

        Collections.sort(arr);
        System.out.println(arr.size());
        // 인텔리제이가 추천해준 방식인데 처음 본다 공부하기
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
