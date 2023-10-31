import java.util.Scanner;

/**
 * BioskopWithScanner11_1
 */
public class BioskopWithScanner11_1 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("======================================");
            System.out.println("     Selamat Datang Di Bioskop 1B");
            System.out.println("======================================");
            System.out.println("- Menu 1 : Input Data Penonton");
            System.out.println("- Menu 2 : Tampilkan Daftar Penonton");
            System.out.println("- Menu 3 : Exit");
            System.out.println("======================================");
            System.out.print("Masukkan Pilihan Anda : ");
            int choice = sc11.nextInt();
            sc11.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                System.out.print("Masukkan Nama : ");
                nama = sc11.nextLine();
                System.out.print("Masukkan Baris: ");
                baris = sc11.nextInt();
                System.out.print("Masukkan Kolom: ");
                kolom = sc11.nextInt();
                sc11.nextLine();

                penonton [baris - 1][kolom - 1]= nama;
                break;
            
                case 2:
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
                }
                break;

                case 3:
                    System.out.println("Terima kasih!");
                    return; // Exit the program
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang benar.");
            }

            System.out.print("Kembali ke menu? (y/n) : ");
            next = sc11.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}