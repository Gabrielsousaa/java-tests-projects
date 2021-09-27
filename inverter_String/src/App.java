public class App {
    public static void main(String[] args) throws Exception {
        String s = "TEXTO";
        String invertida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i);
        }
        System.out.println(invertida);
    }
}