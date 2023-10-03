import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Jogador {
    private int id;
    private String nome;
    private int altura;
    private int peso;
    private String universidade;
    private int anoNascimento;
    private String cidadeNascimento;
    private String estadoNascimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public String getEstadoNascimento() {
        return estadoNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    public Jogador() {
    }

    public Jogador(int id, String nome, int altura, int peso, String universidade, int anoNascimento,
            String cidadeNascimento, String estadoNascimento) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.universidade = universidade;
        this.anoNascimento = anoNascimento;
        this.cidadeNascimento = cidadeNascimento;
        this.estadoNascimento = estadoNascimento;
    }

    public Jogador clone() {
        return new Jogador(id, nome, altura, peso, universidade, anoNascimento, cidadeNascimento, estadoNascimento);
    }

    public void Ler(String idStr, String nome, String alturaStr, String pesoStr, String universidade,
            String anoNascimentoStr,
            String cidadeNascimento, String estadoNascimento) {
        this.id = Integer.parseInt(idStr);
        this.nome = nome;
        this.altura = Integer.parseInt(alturaStr);
        this.peso = Integer.parseInt(pesoStr);
        this.universidade = universidade;
        this.anoNascimento = Integer.parseInt(anoNascimentoStr);
        this.cidadeNascimento = cidadeNascimento;
        this.estadoNascimento = estadoNascimento;
    }

    public void Imprimir() {
        System.out.println("[" + id + " ## " + nome + " ## " + altura + " ## " + peso + " ## " + anoNascimento + " ## "
                + universidade + " ## " + cidadeNascimento + " ## " + estadoNascimento + "]");
    }
}

public class TP02Q01 {

    public static boolean isFim(String s) {
        return (s.length() <= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I'
                && s.charAt(2) == 'M');
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        File file = new File("/tmp/players.csv");
        Scanner scanner = new Scanner(file);

        String idStr = sc.next();
        int idInt = Integer.parseInt(idStr);
        // Cria um objeto Jogador
        Jogador jogador = new Jogador();

        // Configura o Scanner para usar a vírgula como delimitador
        scanner.useDelimiter(",");

        // Conta quantas linhas existem no arquivo para determinar o tamanho do vetor
        int numLinhas = 0;
        while (scanner.hasNextLine()) {
            numLinhas++;
            scanner.nextLine();
        }
        scanner.close();

        // Reabre o arquivo para ler as linhas novamente
        scanner = new Scanner(file);
        scanner.useDelimiter(",");

        // Cria um vetor de strings com o tamanho correto
        String[] linhas = new String[numLinhas];

        // Lê e salva cada linha no vetor
        int i = 0;
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            linhas[i] = scanner.nextLine();
            i++;
        }
        scanner.close();

        // Verifica se idInt é igual a idArq e, se for, chama os métodos da classe
        // Jogador
        while (isFim(idStr) == false) {
            idInt = Integer.parseInt(idStr);
            for (i = 0; i < linhas.length; i++) {
                if (linhas[i] != null && !linhas[i].isEmpty()) {
                    Scanner leitorDeLinha = new Scanner(linhas[i]);

                    leitorDeLinha.useDelimiter(",");

                    // Lê o campo id (pode conter vírgulas)
                    String idArq = leitorDeLinha.next().replaceAll("\"", "");

                    // Substitui espaços vazios por "nao informado" para campos inteiros
                    if (idArq.isEmpty()) {
                        idArq = "nao informado";
                    }

                    // Separa o campo id em número e nome

                    int idNumero = Integer.parseInt(idArq);

                    // Verifica se o número do ID coincide com o ID fornecido como entrada
                    if (idNumero == idInt) {
                        // Restante da leitura dos campos
                        String nome = "";
                        String alturaStr = "";
                        String pesoStr = "";
                        String universidade = "";
                        String anoNascimentoStr = "";
                        String cidadeNascimento = "";
                        String estadoNascimento = "";

                        if (leitorDeLinha.hasNext()) {
                            nome = leitorDeLinha.next().replaceAll("\"", "");
                        }
                        if (leitorDeLinha.hasNext()) {
                            alturaStr = leitorDeLinha.next().replaceAll("\"", "");
                        }
                        if (leitorDeLinha.hasNext()) {
                            pesoStr = leitorDeLinha.next().replaceAll("\"", "");
                        }
                        if (leitorDeLinha.hasNext()) {
                            universidade = leitorDeLinha.next().replaceAll("\"", "");
                        }
                        if (leitorDeLinha.hasNext()) {
                            anoNascimentoStr = leitorDeLinha.next().replaceAll("\"", "");
                        }
                        if (leitorDeLinha.hasNext()) {
                            cidadeNascimento = leitorDeLinha.next().replaceAll("\"", "");
                        }
                        if (leitorDeLinha.hasNext()) {
                            estadoNascimento = leitorDeLinha.next().replaceAll("\"", "");
                        }

                        if (nome.isEmpty()) {
                            nome = "nao informado";
                        }
                        if (alturaStr.isEmpty()) {
                            alturaStr = "nao informado";
                        }
                        if (pesoStr.isEmpty()) {
                            pesoStr = "nao informado";
                        }
                        if (universidade.isEmpty()) {
                            universidade = "nao informado";
                        }
                        if (anoNascimentoStr.isEmpty()) {
                            anoNascimentoStr = "nao informado";
                        }
                        if (cidadeNascimento.isEmpty()) {
                            cidadeNascimento = "nao informado";
                        }
                        if (estadoNascimento.isEmpty()) {
                            estadoNascimento = "nao informado";
                        }

                        jogador.Ler(Integer.toString(idNumero), nome, alturaStr, pesoStr, universidade,
                                anoNascimentoStr,
                                cidadeNascimento, estadoNascimento);

                        jogador.Imprimir();
                        idStr = sc.next();
                    }
                }
            }
        }
    }
}
