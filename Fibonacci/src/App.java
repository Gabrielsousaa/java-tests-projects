import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int soma;
        int n;
        int n1 = 0;
        int n2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque um numero: ");
        n = sc.nextInt();
        do {

            soma = n1 + n2;
            n1 = n2;
            n2 = soma;
            if (n == n1) {
                System.out.println(n + " Numero encontrado, ele faz parte da sequencia " + " = " + n1);
            } else if (n != n1) {
                System.out.println(n + " Numero não encontrado " + " = " + n1);
            }
        } while (n1 <= n);

    }

}
