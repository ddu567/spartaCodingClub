package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 입력 받을 수
        int[] nums = new int[N]; // 숫자 배열
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        // 숫자 배열을 오름차순으로 정렬
        Arrays.sort(nums);

        // 산술 평균 계산
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(Math.round((double) sum / N)); // 반올림하여 출력

        // 중앙값 계산
        System.out.println(nums[N / 2]);

        // 최빈값 계산
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            // 숫자의 등장 횟수
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 최빈값의 최대 횟수
        int maxCount = Collections.max(map.values());
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                list.add(entry.getKey());
            }
        }

        // 최빈값 중 두 번째로 작은 값 찾기
        Collections.sort(list);
        int min2 = list.size() > 1 ? list.get(1) : list.get(0);
        System.out.println(min2);

        // 범위 계산
        System.out.println(nums[N - 1] - nums[0]);


    }
}
