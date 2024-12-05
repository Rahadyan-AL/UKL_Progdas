import java.util.Scanner;

public class soalsulit3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Berapa data dalam array?");
        int banyakdata = input.nextInt();
        int jumlahdata[] = new int[banyakdata];

        for (int a = 0; a < jumlahdata.length; a++) {
            System.out.print("Masukkan angka");
            jumlahdata[a] = input.nextInt();
        }

        boolean jumlah[] = new boolean[jumlahdata.length]; 
        for (int b = 0; b < jumlahdata.length; b++) {
            if (!jumlah[b]) {  
                int hitung = 1;  
                for (int c = b + 1; c < jumlahdata.length; c++) {
                    if (jumlahdata[b] == jumlahdata[c]) {  
                        hitung++; 
                        jumlah[c] = true; 
                    }
                }
                System.out.println(jumlahdata[b] + " muncul " + hitung + " kali");
            }
        }
    }
}