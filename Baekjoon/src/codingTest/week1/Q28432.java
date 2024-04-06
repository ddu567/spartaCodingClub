package codingTest.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// 못 풀었음
public class Q28432 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int index = 0;

        String[] list1 = new String[N];
        for (int i = 0; i < N; i++) {
            list1[i] = br.readLine();
            if (list1[i].equals("?")) {
                index = i;
            }
        }

        String a = String.valueOf(list1[index - 1].charAt(list1[index - 1].length() - 1));
        String b = String.valueOf(list1[index + 1].charAt(0));

        int M = Integer.parseInt(br.readLine());
        String[] list2 = new String[M];
        for (int i = 0; i < M; i++) {
            list2[i] = br.readLine();
        }
        br.close();

        for (int i = 0; i < M; i++) {
//            if (String.valueOf(list2[i].charAt(0)).equals(b) && String.valueOf(list2[i].charAt(list2[i].length()-1)).equals(a)) {
//                System.out.println("answer = " + String.valueOf(list2[i]));
//            }



        }








    }
}
