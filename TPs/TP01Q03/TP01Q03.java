import java.util.*;

class TP01Q03 {

    public static boolean isFim(String s) {
        return (s.length() <= 3 && s.equals("FIM"));
    }

    public static String cifrada(String a) {
        String cifra = new String();
        for (int i = 0; i < a.length(); i++) {
            char atual = a.charAt(i);
            if (atual >= 'a' && atual <= 'z') {
                char novo = (char) (atual + 3);
                if (novo > 'z') {
                    novo = (char) (novo - 26);
                }
                cifra += novo;
            } else if (atual >= 'A' && atual <= 'Z') {
                char novo = (char) (atual + 3);
                if (novo > 'Z') {
                    novo = (char) (novo - 26);
                }
                cifra += novo;
            } else if (atual >= '0' && atual <= '9') {
                char novo = (char) (atual + 3);
                if (novo > '9') {
                    novo = (char) (novo - 26);
                }
                cifra += novo;
            } else {
                cifra += atual;
            }
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
