import java.util.*;
import java.io.*;
public class Main {
    public static String remove(String sentence, String badWord) {
        String oldSentence = sentence;
        sentence = sentence.replace(badWord, "");
        if (oldSentence.equals(sentence)) {return null;}
        return sentence;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("Main.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("Main.out"));
        StringTokenizer st = new StringTokenizer(r.readLine());

        String sentence = st.nextToken();
        st = new StringTokenizer(r.readLine()); //could we possibly remove this statement altogether? seems like a waste of good simplicity
        String badWord = st.nextToken();


        String x = "";
        while ((x = remove(sentence, badWord)) != null) {
            sentence = x;
        }

        pw.println(sentence);
        pw.close();
    }
}
