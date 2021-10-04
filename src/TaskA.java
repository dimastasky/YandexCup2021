import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long[] num = new long[2];

        for (int i = 0; i < num.length; i++) {
            String subsequence = reader.readLine();

            while (subsequence.startsWith("zero")) {
                if (subsequence.startsWith("one") || subsequence.equals("zero")) {
                    break;
                }
                subsequence = subsequence.replaceFirst("zero", "");
            }

            if (subsequence.length() >= 3 && subsequence.length() <= 1000) {
                subsequence = subsequence.replaceAll("one", "1");
                subsequence = subsequence.replaceAll("zero", "0");
                num[i] = Long.parseLong(subsequence, 2);
            }
        }

        if (num[0] > num[1]) {
            System.out.println(">");
        } else if (num[0] < num[1]) {
            System.out.println("<");
        } else if (num[0] == num[1]) {
            System.out.println("=");
        }

    }

}
