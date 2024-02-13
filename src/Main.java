import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;

        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz");
        mat = scan.nextInt();

        System.out.println("Fizik notunuzu giriniz");
        fizik = scan.nextInt();

        System.out.println("Türkçe notunuzu giriniz");
        turkce = scan.nextInt();

        System.out.println("Kimya notunuzu giriniz");
        kimya = scan.nextInt();

        System.out.println("Müzik notunuzu giriniz");
        muzik = scan.nextInt();

        double ortalama=(mat+fizik+turkce+kimya+muzik)/5;
        if (ortalama>=50){
            System.out.println("ortalamanız: "+ortalama);
            System.out.println("Sınıfı Geçtiniz");
        }
        else {
            System.out.println("Kaldınız");
            System.out.println("ortalamanız: "+ortalama);
        }


    }
}
