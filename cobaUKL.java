import java.util.Scanner;
public class cobaUKL{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
       int a=input.nextInt();
       int b=input.nextInt();

       System.out.println("Masukkan operasi matematika");
       String tanda=input.next();


       if("+".equals(tanda)){
        int hasil=a+b;
        System.out.println(hasil);
       }
       else{
        int hasil=a-b;
        System.out.println(hasil);
       }
    }
}