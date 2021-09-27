public class App {
    public static void main(String[] args) throws Exception {
        String[] n_Estados = { "SP", "RJ", "MG", "ES", "OUTROS" };
        double Estados[] = { 67.83643, 36.67866, 29.22988, 27.16548, 19.84953 };
        double percentual, total = 0;
        int i = 0;
        for (i = 0; i < Estados.length; i++) {
            total = Estados[i] + total;
        }
        for (i = 0; i < Estados.length; i++) {

            percentual = (Estados[i] / total) * 100;
            System.out.println(n_Estados[i] + " - R$ " + Estados[i] + " - percentual: " + percentual + "%");
        }
        percentual = (Estados[0] / total) * 100;
        System.out.println("Total dos Estados: " + " R$ " + total);

    }
}
