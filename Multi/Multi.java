import java.util.Scanner;

class Multi {

    public static void main(String[] args) {
        
        // Membuat Array dan Scanner
        String[][] piket = new String[3][6];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap mja
        for(int bar = 0; bar < piket.length; bar++){
            for(int kol = 0; kol < piket[bar].length; kol++){
                System.out.format("Pembagian piket kelas 10 : ", bar, kol);
                piket[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("Daftar piket");
        System.out.println("---------------------------------------------");
        for(int bar = 0; bar < piket.length; bar++){
            for(int kol = 0; kol < piket[bar].length; kol++){
                System.out.format("| %s | \t", piket[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}
