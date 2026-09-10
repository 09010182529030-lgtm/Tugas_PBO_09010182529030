package Tugas_7;

public class Tugas_7_1 {
    public static void main(String[] args) {

        String days[] = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        // While-loop
        System.out.println("Menggunakan while-loop:");

        int i = 0;

        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }

        // Do-while
        System.out.println("\nMenggunakan do-while:");

        i = 0;

        do {
            System.out.println(days[i]);
            i++;
        } while (i < days.length);

        // For-loop
        System.out.println("\nMenggunakan for-loop:");

        for (i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}