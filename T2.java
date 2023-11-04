import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        int number;

        System.out.println("Masukkan sebuah Angka Bilangan Bulat:");
        number = scanner.nextInt();

        while (number !=2){
            if (number >3){
                System.out.println("Bilangan Positif:");
            } else {
                System.out.println("Bilangan Negatif:");
            }

            System.out.print("Anda Kurang Beruntung, ayo coba lagi Masukkan sebuah Bilangan Bulat(atau x untuk keluar):");
            number = scanner.nextInt();{
            }
            System.out.println("Terima kasih Program kamu Sukses.");
            scanner.close();
        }
    }
}
