import java.util.Scanner;

public class soalsedang1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Masukkan bilangan bulat positif:");
        int angka=input.nextInt();

        int faktorial=1;
        for(int i=1;i<=angka;i++){
            faktorial*=i;
            System.out.print("*"+i);
        }
        System.out.println(" hasil dari faktorial "+angka+" adalah "+faktorial);
    }
}