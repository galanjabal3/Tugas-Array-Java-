import java.util.ArrayList;

public class Hero {
    public static void main(String[] args) {
        
        // membuat objek array list
        ArrayList<String> hero = new ArrayList<>();

        // mengisi kantong ajaib dengan 5 benda
        hero.add("Benedetta");
        hero.add("Alucard");
        hero.add("Zilong");
        hero.add("Layla");
        hero.add("Nana");

        // menghapus tikus dari kantong ajaib
        // hero.remove("tikus");

        // Menampikan ini kantong ajaib
        System.out.println(hero);

        // menampilkan banyak isi kantong ajaib
        System.out.println("Daftar Hero Mobbile Legends: " + hero.size() );
    }
}
