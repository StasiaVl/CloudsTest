import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_DoctorWho {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            String line;
            int n;
            int[] array;
            while (true) {
                line = in.readLine();
                st = new StringTokenizer(line, " ");
                n = st.countTokens();
                array = new int[n];
                for (int i = 0; i < n; i++) {
                    array[i] = Integer.parseInt(st.nextToken());
                }
                if (isEnough(array))
                    System.out.println("ok");
                else
                    System.out.println("fail");
                if (!in.ready())
                    break;
                else
                    System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static boolean isEnough(int[] array) {
        int n = array.length - 1;
        int a;
        for (int j = 0; j <= n; j++) {
            Arrays.sort(array);
            a = array[n];
            if (a > n)
                return false;
            for (; a > 0; --a) {
                if (array[n - a] == 0) {
                    return false;
                } else {
                    array[n - a]--;
                }
            }
            array[n] = 0;
        }
        return true;
    }
}
