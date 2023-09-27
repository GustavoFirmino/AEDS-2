#include <stdio.h>
#include <string.h>

int isFim(char s[]) {
    return (strlen(s) >= 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M');
}

void contrario(char a[], char invertida[]) {
    int i, j = 0;
    for (i = strlen(a) - 1; i >= 0; i--) {
        invertida[j++] = a[i];
    }
    invertida[j] = '\0';
}

int isPalindromo(char a[], char b[]) {
    return (strcmp(a, b) == 0);
}

int main() {
    char entrada[1000];
    char invertida[1000];
    
    fgets(entrada, sizeof(entrada), stdin);
    entrada[strlen(entrada) - 1] = '\0'; // Remove o caractere de nova linha
    
    while (!isFim(entrada)) {
        contrario(entrada, invertida);
        if (isPalindromo(entrada, invertida)) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
        fgets(entrada, sizeof(entrada), stdin);
        entrada[strlen(entrada) - 1] = '\0'; // Remove o caractere de nova linha
    }
    
    return 0;
}
