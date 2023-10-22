import java.util.Arrays;

public class Anagram_checker {
    public static void main(String[] args) {

        String x = "listen";
        String y = "silent";
        char p[] = x.toCharArray();
        char q[] = x.toCharArray();
        Arrays.sort(p);
        Arrays.sort(q);
        if (Arrays.equals(p, q)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

    }
}
