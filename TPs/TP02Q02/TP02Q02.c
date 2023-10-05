#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Jogador {
    int id;
    char nome[100];
    int altura;
    int peso;
    char universidade[100];
    int anoNascimento;
    char cidadeNascimento[100];
    char estadoNascimento[100];
};

typedef struct Jogador Jogador;

void Ler(Jogador *jogador, int id, char *nome, int altura, int peso, char *universidade,
         int anoNascimento, char *cidadeNascimento, char *estadoNascimento) {
    jogador->id = id;
    strcpy(jogador->nome, nome);
    jogador->altura = altura;
    jogador->peso = peso;
    strcpy(jogador->universidade, universidade);
    jogador->anoNascimento = anoNascimento;
    strcpy(jogador->cidadeNascimento, cidadeNascimento);
    strcpy(jogador->estadoNascimento, estadoNascimento);
}

void Imprimir(Jogador *jogador) {
    printf("[%d ## %s ## %d ## %d ## %d ## %s ## %s ## %s]\n",
           jogador->id, jogador->nome, jogador->altura, jogador->peso,
           jogador->anoNascimento, jogador->universidade,
           jogador->cidadeNascimento, jogador->estadoNascimento);
}

int main() {
    FILE *file = fopen("/tmp/players.csv", "r");
    if (file == NULL) {
        fprintf(stderr, "Erro ao abrir o arquivo.\n");
        return 1;
    }

    int idInt;
    char idStr[100];

    scanf("%s", idStr);
    idInt = atoi(idStr);

    Jogador jogador;

    char linha[4000];
    int numLinhas = 0;

    while (fgets(linha, sizeof(linha), file) != NULL) {
        numLinhas++;
    }

    rewind(file);

    char *linhas[numLinhas];

    int i = 0;
    fgets(linha, sizeof(linha), file); // Ignorar a primeira linha de cabeçalho
    while (fgets(linha, sizeof(linha), file) != NULL) {
        linhas[i] = strdup(linha);
        i++;
    }

    fclose(file);

    while (strncmp(idStr, "FIM", 3) != 0) {
        idInt = atoi(idStr);
        for (i = 0; i < numLinhas; i++) {
            if (linhas[i] != NULL && strcmp(linhas[i], "") != 0) {
                char *token;
                token = strtok(linhas[i], ",");
                char idArqStr[100];
                strcpy(idArqStr, token);
                idArqStr[strlen(idArqStr) - 1] = '\0'; // Remover a quebra de linha

                int idArq = atoi(idArqStr);

                if (idArq == idInt) {
                    char nome[100];
                    char alturaStr[100];
                    char pesoStr[100];
                    char universidade[100];
                    char anoNascimentoStr[100];
                    char cidadeNascimento[100];
                    char estadoNascimento[100];

                    token = strtok(NULL, ",");
                    strcpy(nome, token);

                    token = strtok(NULL, ",");
                    strcpy(alturaStr, token);

                    token = strtok(NULL, ",");
                    strcpy(pesoStr, token);

                    token = strtok(NULL, ",");
                    strcpy(universidade, token);

                    token = strtok(NULL, ",");
                    strcpy(anoNascimentoStr, token);

                    token = strtok(NULL, ",");
                    strcpy(cidadeNascimento, token);

                    token = strtok(NULL, ",");
                    strcpy(estadoNascimento, token);

                    if (strcmp(nome, "") == 0) {
                        strcpy(nome, "nao informado");
                    }
                    if (strcmp(alturaStr, "") == 0) {
                        strcpy(alturaStr, "nao informado");
                    }
                    if (strcmp(pesoStr, "") == 0) {
                        strcpy(pesoStr, "nao informado");
                    }
                    if (strcmp(universidade, "") == 0) {
                        strcpy(universidade, "nao informado");
                    }
                    if (strcmp(anoNascimentoStr, "") == 0) {
                        strcpy(anoNascimentoStr, "nao informado");
                    }
                    if (strcmp(cidadeNascimento, "") == 0) {
                        strcpy(cidadeNascimento, "nao informado");
                    }
                    if (strcmp(estadoNascimento, "") == 0) {
                        strcpy(estadoNascimento, "nao informado");
                    }

                    Ler(&jogador, idArq, nome, atoi(alturaStr), atoi(pesoStr), universidade,
                        atoi(anoNascimentoStr), cidadeNascimento, estadoNascimento);

                    Imprimir(&jogador);

                    scanf("%s", idStr);
                }
            }
        }
    }

    // Liberar memória alocada para linhas
    for (i = 0; i < numLinhas; i++) {
        free(linhas[i]);
    }

    return 0;
}
