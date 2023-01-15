import java.util.*;
import java.io.*;
public class Main {// could optimize this by going into some cs and only computing values if they are above a certain average but it fits the time and space limit and the algorithm is already rather fast, atleast to my current understanding, so i will leave it be for now.
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("Main.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Main.out")));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int doors = Integer.parseInt(st.nextToken());
        int[] doorWeights = new int[doors];
        for (int i = 0; i < doors; i++) {
            st = new StringTokenizer(r.readLine());
            doorWeights[i] = Integer.parseInt(st.nextToken());
        }

        int best = Integer.MAX_VALUE;
        for (int i = 0; i < doors; i++) {
            int distance = 0;
            for (int i2 = 0; i2 < doors; i2++) {
                distance += doorWeights[(i + i2) % doors] * i2;
            }
            if (distance < best) {
                best = distance;
            }
        }
        pw.println(best);

        r.close();
        pw.close();
    }   
}