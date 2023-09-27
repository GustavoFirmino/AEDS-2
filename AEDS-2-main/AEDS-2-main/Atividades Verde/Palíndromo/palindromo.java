import java.util.*;

class palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String palavra = sc.nextLine();
            if (palavra == "FIM") {
                break;
            }
            String contrario = "";

            for (int i = palavra.length() - 1; i > 0; i--) {
                contrario += palavra.charAt(i);
            }

            if (palavra.equals(contrario)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
            

        }
        sc.close();
    }

}