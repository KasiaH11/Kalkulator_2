import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Witaj w kalkulatorze \nPodaj pierwszą liczbę");
        double liczba1 = sc.nextDouble();
        System.out.println("Podaj druga liczbę");
        double liczba2 = sc.nextDouble();
        System.out.println("1.dodawanie, 2.odejmowanie, 3.mnozenie, 4.dzielenie");
        System.out.println("Jaka operacje chcesz wykonac?");
        int opcja = sc.nextInt();
        switch (opcja) {
            case 1:
                System.out.println(liczba1 + liczba2);
                break;
            case 2:
                System.out.println(liczba1 - liczba2);
                break;
            case 3:
                System.out.println(liczba1 * liczba2);
                break;
            case 4:
                System.out.println(liczba1 / liczba2);
                break;
        }
    }
    }