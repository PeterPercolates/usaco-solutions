import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("Main.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("Main.out"));
        StringTokenizer st = new StringTokenizer(r.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int total = (b-a) + (d-c);
        int subtraction = Math.max(Math.min(b, d) - Math.max(a, c), 0);
        pw.println(total - subtraction);
        pw.close();
        r.close();
    }
}