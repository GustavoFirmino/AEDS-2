import java.util.*;


class Jogador{
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

    public Jogador(){
    }
    public Jogador(int id, String nome, int altura, int peso, String universidade, int anoNascimento, String cidadeNascimento, String estadoNascimento){
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
        return new Jogador(id, nome, altura, peso, universidade, anoNascimento,
                cidadeNascimento, estadoNascimento);
    }
    
    public void Ler(Scanner scanner) {
        this.id = scanner.nextInt();
        this.nome = scanner.next();
        this.altura = scanner.nextInt();
        this.peso = scanner.nextInt();
        this.universidade = scanner.next();
        this.anoNascimento = scanner.nextInt();
        this.cidadeNascimento = scanner.next();
        this.estadoNascimento = scanner.next();
    }

    public void Imprimir(){
        System.out.println("[" + id + "##" + nome + "##" + altura + "##" + peso + "##" + anoNascimento + "##" + universidade + "##" + cidadeNascimento + "##" + estadoNascimento + "]");
    }


}

public class TP02Q01 {
    
     public static boolean isFim(String s) {
        return (s.length() <= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I'
                && s.charAt(2) == 'M');
    }
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String idStr;
    Jogador jogador;
    
    idStr = sc.next();
    
    while(isFim(idStr) == false){
        
        
        jogador = new Jogador();
        jogador.Ler(sc);
        jogador.Imprimir();
        idStr = sc.next();
    }
    sc.close();
        }
}
