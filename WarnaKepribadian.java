
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class WarnaKepribadian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Print colorful header
        printHeader();
        
        // Get color choice and name
        System.out.print("PILIH WARNA FAVORITMU : ");
        String warna = input.nextLine().toLowerCase();
        
        System.out.print("NAMA KAMU : ");
        String nama = input.nextLine();
        
        // Print results
        System.out.println("\n===HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "===");
        
        // Check color and print personality
        if (isValidColor(warna)) {
            System.out.println("Warna Favoritmu adalah " + warna.toUpperCase());
            printPersonality(warna);
        } else {
            System.out.println("Oops.. Belum teridentifikasi");
        }
        
        input.close();
    }
    
    private static void printHeader() {
        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU\n");
        System.out.println("MERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU\n");
    }
    
    private static boolean isValidColor(String warna) {
        return warna.equals("merah") || warna.equals("hijau") || 
               warna.equals("kuning") || warna.equals("biru") || 
               warna.equals("ungu");
    }
    
    private static void printPersonality(String warna) {
        switch (warna.toLowerCase()) {
            case "merah":
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
                break;
                
            case "hijau":
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
                
            case "kuning":
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
                break;
                
            case "biru":
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;
                
            case "ungu":
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
        }
    }
}
