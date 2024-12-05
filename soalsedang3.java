import java.util.Random;
import java.util.Scanner;

public class soalsedang3{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random= new Random();

        while(true){
        char []operator= {'*','/','%'};
        char tanda = operator[random.nextInt(operator.length)];
        int angka1=random.nextInt(10)+1;
        int angka2=random.nextInt(10)+1;

        System.out.println(angka1+" "+tanda+" "+angka2+" =");
        double jawaban=input.nextDouble();

        double hasilbenar;
        hasilbenar = switch (tanda) {
                case '*' -> angka1*angka2;
                case '/' -> (double)angka1/angka2;
                default -> angka1%angka2;
            };
       
        if(jawaban==hasilbenar){
            System.out.println("Benar");
        }
        else{
            System.out.println("Salah, "+hasilbenar+" adalah jawaban yang benar");
        }

        System.out.print("Apakah ingin lanjut? (yes/no)");
        String lanjut = input.next();
        if (lanjut.equalsIgnoreCase("no")) {
            break; 
        }
        }
    }
}// 2 variabel, beri if else
//+ jumlah, - mines