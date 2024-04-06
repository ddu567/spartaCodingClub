package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스
        int T = Integer.parseInt(br.readLine());

        // 가진 의상 수
        HashMap<String, Integer> clothes = new HashMap<>();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken(); // 의상 이름은 필요 없으므로 건너띔
            if (st.hasMoreTokens()) { // 토큰이 더 있는지 확인
                String type = st.nextToken(); // 의상의 종류

                // 해당 종류의 의상이 이미 있으면 개수를 1 증가, 없으면 1로 초기화
                clothes.put(type, clothes.getOrDefault(type, 0) + 1);
            }
        }

        int answer = 1;
        for (int value : clothes.values()) {
            // 각 의상 종류별로 선택한 경우의 수를 곱함
            answer *= (value + 1); // 해당 종류의 의상을 선택하지 않는 경우를 포함하기 위해 +1
        }

        // 모든 의상을 선택하지 않는 경우 1을 빼줌
        System.out.println(answer - 1);
    }
}
