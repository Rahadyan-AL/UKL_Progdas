import java.util.Arrays;
import java.util.Scanner;

public class soalsulit2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Berapa data dalam array?");
        int banyakdata=input.nextInt();
        int jumlahdata[]=new int[banyakdata];
        
        for(int a=0; a<jumlahdata.length; a++){
            System.out.println("Masukkan ke "+Arrays.toString(jumlahdata)+" angka yang diinginkan");
            jumlahdata[a]= input.nextInt();
        }
        System.out.println(Arrays.toString(jumlahdata));
        
        @SuppressWarnings("unused")
        boolean duplikat=false;
        for (int b = 0; b<jumlahdata.length; b++) {
            for (int c= b + 1; c < jumlahdata.length; c++) {
                if (jumlahdata[b] == jumlahdata[c]) {  
                System.out.println("Array memiliki elemen duplikat: " + jumlahdata[b]);
                duplikat=true;
                }
            }
        }
    }
}
