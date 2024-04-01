package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> haveNum = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 갖고 있는 카드 숫자 입력. 없으면 기본값 0, 있으면 +1
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            haveNum.put(num, haveNum.getOrDefault(num, 0)+1);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br. readLine()); // 다시 재정의 하는 이유는?
        StringBuilder sb = new StringBuilder();
        // 입력한 수의 개수 출력, 없으면 기본값인 0 출력
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(haveNum.getOrDefault(num, 0)).append(' ');
        }

        br.close();
        System.out.println(sb);
    }
}
