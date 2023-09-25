import java.util.*;

class TP01Q03 {

    public static boolean isFim(String s) {
        return (s.length() <= 3 && s.equals("FIM"));
    }

    public static String cifrada(String a) {
        String cifra = new String();
        for (int i = 0; i < a.length(); i++) {
            char atual = a.charAt(i);
            cifra += (char) (atual + 3);
        }
        return cifra;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        while (!isFim(entrada)) {
            System.out.println(cifrada(entrada));
            entrada = sc.nextLine();
        }
        sc.close();
    }
}