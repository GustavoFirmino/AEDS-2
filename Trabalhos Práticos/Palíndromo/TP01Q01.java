import java.util.*;

class TP01Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String palavra = sc.nextLine();
            if (palavra == "FIM") {
                break;
            }
            String contrario = "";

            for (int j=0, i = palavra.length() - 1; i > 0;j++, i--) {
                contrario += palavra.charAt(i);
            }
            System.out.println(contrario);
            if (palavra.equals(contrario)) {
                System.out.println("SIM");
            } else if(palavra.equals(contrario) == false){
                System.out.println("NAO");
            }
            

        }
        sc.close();
    }

}