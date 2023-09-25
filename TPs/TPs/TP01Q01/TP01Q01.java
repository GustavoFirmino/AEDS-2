import java.util.*;

class TP01Q01 {
    public static boolean isFim(String s) {
        return (s.length() <= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I'
                && s.charAt(2) == 'M');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        while (isFim(entrada) == false) {
            String contrario = "";
            for (int i = entrada.length() - 1; i > 0; i--) {
                contrario += entrada.charAt(i);
            }
            System.out.println(entrada);
            System.out.println(contrario);
            /*
             * if (entrada.equals(contrario)) {
             * System.out.println("SIM");
             * } else if(entrada.equals(contrario) == false){
             * System.out.println("NAO");
             * }
             */

        }
        sc.close();
    }

}