#include <stdio.h>
#include <string.h>

int main() {
    char palavra[100]; // Defina um tamanho máximo para a palavra
    while (fgets(palavra, sizeof(palavra), stdin)) {
        palavra[strcspn(palavra, "\n")] = '\0'; // Remove a quebra de linha da entrada

        if (strcmp(palavra, "FIM") == 0) {
            break;
        }

        char contrario[100] = "";
        int tam = strlen(palavra);

        for (int i = tam - 1; i >= 0; i--) {
            strncat(contrario, &palavra[i], 1);
        }

        if (strcmp(palavra, contrario) == 0) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
    }
    return 0;
}
