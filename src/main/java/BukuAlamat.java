public class BukuAlamat {
    public static void main(String[] args) {

        String entry[][] = {
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}
        };

        for (String[] entry1 : entry) {
            System.out.println("Name    : " + entry1[0]);
            System.out.println("Tel. #  : " + entry1[1]);
            System.out.println("Address : " + entry1[2]);
            System.out.println();
        }
    }
}