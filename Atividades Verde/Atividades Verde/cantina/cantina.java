import java.util.Arrays;
import java.util.Scanner;

public class cantina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumeroDeTestes = sc.nextInt();
        int[][] VetorDeVetores = new int[NumeroDeTestes][];

        for (int i = 0; i < NumeroDeTestes; i++) {
            int QuantidadeDeAlunos = sc.nextInt();
            VetorDeVetores[i] = new int[QuantidadeDeAlunos];
            for (int j = 0; j < QuantidadeDeAlunos; j++) {
                VetorDeVetores[i][j] = sc.nextInt();
            }
        }

        int[][] VetorDeVetoresOrdenado = VetorDeVetores;

        for (int i = 0; i < NumeroDeTestes; i++) {
            for (int j = 1; j < VetorDeVetoresOrdenado.length; j++) {
                for (int k = 0; k < j; k++) {
                    if (VetorDeVetoresOrdenado[i][j] > VetorDeVetoresOrdenado[i][k]) {
                        int temp = VetorDeVetoresOrdenado[i][j];
                        VetorDeVetoresOrdenado[i][j] = VetorDeVetoresOrdenado[i][k];
                        VetorDeVetoresOrdenado[i][k] = temp;
                    }
                }
            }
        }

        sc.close();

        int NumeroDeTrocas = 0;

        for (int i = 0; i < NumeroDeTestes; i++) {
            for (int j = 0; j < VetorDeVetores[i].length; j++) {
                System.out.print(VetorDeVetores[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < NumeroDeTestes; i++) {
            for (int j = 0; j < VetorDeVetores[i].length; j++) {
                System.out.print(VetorDeVetoresOrdenado[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < NumeroDeTestes; i++) {
            for (int j = 0; j < VetorDeVetores[i].length; j++) {
                if (VetorDeVetores[i][j] == VetorDeVetoresOrdenado[i][j]) {

                    NumeroDeTrocas++;
                }
            }

            System.out.println(NumeroDeTrocas);
            NumeroDeTrocas = 0;
        }

    }
}
