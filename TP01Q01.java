import java.util.*;

class TP01Q01{

    public static boolean isFim(String s){
        boolean resp = false;
        if(s.length() >= 3 && s.charAt(0)=='F' && s.charAt(1)=='I' && s.charAt(2)=='M'){
            resp = true;
        };
        return resp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        while (isFim(entrada) == false) {
            String contrario = "";
            for (int j=0, i = entrada.length() - 1; i > 0;j++, i--) {
                contrario.charAt(j) = entrada.charAt(i);
            }
            System.out.println(contrario);
            if (entrada.equals(contrario)) {
                System.out.println("SIM");
            } 
        }
        sc.close();
    }

}
