package Tugas_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas_5_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.print("Enter word1: ");
        String word1 = br.readLine();

        System.out.print("Enter word2: ");
        String word2 = br.readLine();

        System.out.print("Enter word3: ");
        String word3 = br.readLine();

        System.out.println(word1 + " " + word2 + " " + word3);
    }
}