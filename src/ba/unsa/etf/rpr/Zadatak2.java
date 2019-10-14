package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Zadatak2 {

    public static int sumaCifara(int n) {
        int suma = 0;
        while(n>0) {
            suma+=(n%10);
            n/=10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n;
        Scanner ulaz = new Scanner(System.in);
        do {
            System.out.println("Unesite broj n: ");
            n = ulaz.nextInt();
        } while(n<0);

        for(int i=1; i<=n; i++) {
            if((i % sumaCifara(i)) == 0) {
                System.out.printf(i + ". broj: "+ i + "\n");
            }
        }

    }
}
