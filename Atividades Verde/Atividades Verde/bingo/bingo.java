import java.util.*;

class bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K, U;
        // N = quantidade de cartelas, K = quantidade de números nas cartelas, U = até
        // qual número a contagem vai
        N = sc.nextInt();
        K = sc.nextInt();
        U = sc.nextInt();
        int[][] cartelas = new int[N][K];
        int[] ordem = new int[U];
        int[][] confere = new int[N][U];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < U; j++) {
                confere[i][j] = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; i++) {
                cartelas[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < U; i++) {
            ordem[i] = sc.nextInt();
        }
        int i = 0;
        for (int m = 0; m < U; m++) {
            for (int j = 0; j < K; j++) {
                if (ordem[m] == cartelas[i][j]) {
                    confere[i][j] = 1;
                }
            }
            if(){
                
            }
        }

    }
}