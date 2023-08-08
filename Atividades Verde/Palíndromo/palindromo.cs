using System;

class Palindromo {
    static void Main(string[] args) {
        while (true) {
            string palavra = Console.ReadLine();
            if (palavra == "FIM") {
                break;
            }

            string contrario = "";

            for (int i = palavra.Length - 1; i >= 0; i--) {
                contrario += palavra[i];
            }

            if (palavra == contrario) {
                Console.WriteLine("SIM");
            } else {
                Console.WriteLine("NAO");
            }
        }
    }
}
