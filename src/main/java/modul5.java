import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class modul5 {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.print("Enter word1:");
        String word1 = input.readLine();

        System.out.print("Enter word2:");
        String word2 = input.readLine();

        System.out.print("Enter word3:");
        String word3 = input.readLine();

        System.out.println();
        System.out.println(word1 + " " + word2 + " " + word3);
    }
}