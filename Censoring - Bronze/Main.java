import java.util.*;
import java.io.*;
public class Main {
    public static String remove(String sentence, String badWord) {
        int ib = 0;
        int i = 0;
        return removeHelper(sentence, badWord, i, ib);
    }
    public static String removeHelper(String sentence, String badWord, int iterator, int badworditerator) {
        if (sentence.length() - 1 == iterator) {
            return null;
        }
        if (sentence.charAt(iterator) == badWord.charAt(badworditerator))  {
            sentence.replace(badworditerator)
            return removeHelper(sentence, badWord, iterator + 1, badworditerator + 1);
        }else {
            return removeHelper(sentence, badWord, iterator + 1, badworditerator);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("Main.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("Main.out"));
        StringTokenizer st = new StringTokenizer(r.readLine());

        String sentence = st.nextToken();
        st = new StringTokenizer(r.readLine()); //could we possibly remove this statement altogether? seems like a waste of good simplicity
        String badWord = st.nextToken();
        remove(sentence, badWord);
        

        
    }
}
