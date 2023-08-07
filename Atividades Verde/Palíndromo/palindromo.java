import java.util.*;

class palindromo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        int tamanho = palavra.length();
        int cont = 0;

        while(palavra != "FIM"){
            for(int i=0; i>=tamanho-1; i++,tamanho--){
                if(palavra.charAt(i)==palavra.charAt(tamanho-1)){
                    cont++;
                }
            }
            if(cont == tamanho/2){
                System.out.println("SIM");
            }
            else if(cont != tamanho/2){
                System.out.println("NAO");
            }
        }
        sc.close();
    }
}