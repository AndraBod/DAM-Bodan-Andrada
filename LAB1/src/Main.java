import java.util.*;
public class Main
{
    public static boolean estePrim(int nr)
    {
        if (nr <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nr); i++)
        {
            if (nr % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void gasestePrimeGemene(int limita)
    {
        for (int i = 2; i < limita - 2; i++)
        {
            if (estePrim(i) && estePrim(i + 2))
            {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Ex1.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati un numar intreg:");
        int nr = scanner.nextInt();
        scanner.nextLine();
        if(nr<0)
        {
            System.out.println("Numarul este negativ.");
        }
        else
        {
            System.out.println("Numarul este pozitiv.");
        }

        System.out.println("Ex2.");
        System.out.print("Introduceti dimensiunea tabloului: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] v = new int[n];
        System.out.println("Introduceti elementele tabloului: ");
        for(int i=0;i<n;i++)
        {
            System.out.print("Elementul" + (i + 1) + ": ");
            v[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int suma=0;
        for(int i=0;i<n;i++)
        {
            suma=suma+v[i];
        }
        int media=suma/n;
        System.out.println("Media numerelor este: " +media);

        System.out.println("Ex3.");
        System.out.println("Numere prime gemene mai mici de 100:");
        gasestePrimeGemene(100);

        System.out.println("Ex4.");
        System.out.println("Nume: ");
        String nume = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Varsta: ");
        int varsta = scanner.nextInt();
        Caine caine = new Caine(nume,varsta);
    }
}