import java.io.PrintWriter;
import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        byte a = in.nextByte();
        boolean notOriented = true;
        byte[][] nums = new byte[a][a];
        byte c;
        for(int i=0;i < a; i++){
            for(int j=0;j < a; j++){
                c =in.nextByte();
                if (i == j && c == 1){
                    notOriented = false;
                    break;
                }else nums[i][j] = c;
            }
        }
        if (notOriented){
            for(int i=0;i<a;i++){
                for(int j=i+1;j < a; j++){
                    if (nums[j][i] != nums[i][j]){
                        notOriented = false;
                        break;
                    }
                }
            }
        }

        if (!notOriented)
            out.println("NO");
        else
            out.println("YES");
        out.flush();

    }
}
