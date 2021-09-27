public class App {
    public static void main(String[] args) throws Exception {
        int indice = 13, SOMA = 0, K = 0;
        do {
            K= K + 1;
            SOMA = SOMA + K;

        } while (K < indice);
        System.out.println(SOMA);
    }
}
