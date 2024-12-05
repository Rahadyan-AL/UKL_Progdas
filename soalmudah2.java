import java.util.Scanner;
public class soalmudah2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Masukkan bilangan: ");
        int angka= input.nextInt();

        if(angka%2==1){
            System.out.println("Bilangan "+angka+" adalah ganjil");
        }
        else{
            System.out.println("Bilangan "+angka+" adalah genap");
        }
    }
}