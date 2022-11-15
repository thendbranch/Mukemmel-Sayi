// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
            ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
            ifadelerini ekrana yazan programı Java dilinde yazınız.

        Mükemmel Sayı Nedir ?
            Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
            kendisine eşit olan sayıya mükemmel sayı denir.
         */


        Scanner input = new Scanner(System.in);
        System.out.print("lütfen sayı giriniz :");
        int sayi = input.nextInt();
        int a = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0){
                a +=i;
            }
        }
        if (sayi == a){
            System.out.println("Mükemmel Sayıdır");
        } else if (sayi != a) {
            System.out.println("Mükemmel Sayı Değildir");
        }
    }
}