public class App {
    public static void main(String[] args) throws Exception {

        double maior = 0, menor = 0;
        String mes[] = { "Junho", "Abril" };

        double valor_J[] = { 22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174,
                11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826,
                43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61 };

        double valor_A[] = { 31490.7866, 37277.9400, 37708.4303, 0.0000, 0.0000, 17934.2269, 0.0000, 6965.1262,
                24390.9374, 14279.6481, 0.0000, 0.0000, 39807.6622, 27261.6304, 39775.6434, 29797.6232, 17216.5017,
                0.0000, 0.0000, 12974.2000, 28490.9861, 8748.0937, 8889.0023, 17767.5583, 0.0000, 0.0000, 3071.3283,
                48275.2994, 10299.6761, 39874.1073 };

        int dias[] = new int[31];

        for (int i = 1, j = 0; i < dias.length; i++) {
            dias[i] = i;
            System.out.println(mes[0] + " dia " + dias[i] + " valor: " + valor_J[j]);
            j++;
        }

        MenorMaior(valor_J, dias, maior, menor);
        MediaMensal(valor_J, dias);
        System.out.println("\n");

        for (int i = 1, j = 0; i < dias.length; i++) {
            dias[i] = i;
            System.out.println(mes[1] + " dia " + dias[i] + " valor: R$ " + valor_A[j]);
            j++;
        }

        MenorMaior(valor_A, dias, maior, menor);
        MediaMensal(valor_A, dias);

    }

    static void MediaMensal(double valor[], int dias[]) {

        double soma = 0;
        int n_dias = 0;
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > 0) {
                soma = (soma + valor[i]) / 2;
            }
        }
        System.out.println("Media mensal de faturamento: R$" + soma);
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > soma && valor[i] > 0) {
                n_dias++;
            }
        }
        System.out.println("Número de dias com maior faturamento do que a média mensal: " + n_dias + " dias");

    }

    static void MenorMaior(double valor[], int[] dias, double maior, double menor) {
        int i = 0, j = 1, k = 1;

        for (i = 0, j = 1; i < valor.length; i++) {
            maior = valor[i];
        }
        for (i = 0, k = 1; i < valor.length; i++) {
            menor = valor[i];
        }
        for (i = 0, j = 1; i < valor.length; i++) {
            if (valor[i] > maior && valor[i] > 0) {
                maior = valor[i];
                j = dias[i];
                j++;
            }
        }
        for (i = 0, k = 1; i < valor.length; i++) {

            if (valor[i] < menor && valor[i] > 0 && dias[k] == k) {
                menor = valor[i];
                k = dias[i];
                k++;
            }

        }
        System.out.println("\n");
        System.out.println("Maior Faturamento: " + "R$" + maior + " no dia: " + j);
        System.out.println("Menor Faturamento: " + "R$" + menor + " no dia: " + k);
    }

}
