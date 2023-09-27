using System;

class Program
{
    static void Main()
    {
        // Lê a idade de Dona Mônica
        int idadeMonica = int.Parse(Console.ReadLine());

        // Lê a idade de um dos filhos
        int idadeFilho1 = int.Parse(Console.ReadLine());

        // Lê a idade do outro filho
        int idadeFilho2 = int.Parse(Console.ReadLine());

        // Calcula a idade do terceiro filho
        int idadeFilho3 = idadeMonica - (idadeFilho1 + idadeFilho2);

        // Encontra a idade do filho mais velho
        int idadeMaisVelho = Math.Max(idadeFilho1, Math.Max(idadeFilho2, idadeFilho3));

        // Imprime a idade do filho mais velho
        Console.WriteLine(idadeMaisVelho);
    }
}
