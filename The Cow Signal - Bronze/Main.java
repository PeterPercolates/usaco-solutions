import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("Main.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("Main.out"));
        StringTokenizer st = new StringTokenizer(r.readLine());

        int height = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int scale = Integer.parseInt(st.nextToken());

        String token;
        for (int i = 0; i < height; i++) {
            st = new StringTokenizer(r.readLine());
            token = st.nextToken();
            for (int i2 = 0; i2 < length; i2++) {
            for (int i2 = 0; i2 < length; i2++) {
                for (int i3 = 0; i3 < scale; i3++) {
                    pw.print(token.charAt(i2));
                }
            }
            pw.println();
        }

        pw.close();
        r.close();
    }
}