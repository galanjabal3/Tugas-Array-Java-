import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        // membuat array buah-buahan
        String[] makanan = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < makanan.length; i++ ){
            System.out.print("Makanan Kesukaan kamu " + i + ": ");
            makanan[i] = scan.nextLine();
        }
        System.out.println("-------------------");

        // menampilkan semua isi array
        for( String b : makanan ){
            System.out.println(b);
        }
    }
}
