class Personagem{
private String nome;
private int Altura;
private double peso;
private String corDoCabelo;
private String corDaPele;
private String corDosOlhos;
private String anoNascimento;
private String genero;
private String homeworld;

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

public double getPeso() {
    return peso;
  }

  public void setPesp(double peso) {
    this.peso = peso;
  }

public String getCorDoCabelo() {
    return corDoCabelo;
  }

  public void setCorDoCabelo(String corDoCabelo) {
    this.corDoCabelo = corDoCabelo;
  }

public String getCorDaPele() {
    return corDaPele;
  }

  public void setCorDaPele(String corDaPele) {
    this.corDaPele = corDaPele;
  }

public String getCorDosOlhos() {
    return corDosOlhos;
  }

  public void setCorDosOlhos(String corDosOlhos) {
    this.corDosOlhos = corDosOlhos;
  }

public String getAnoNascimento() {
    return anoNascimento;
  }

  public void setAnoNascimento(String anoNascimento) {
    this.anoNascimento = anoNascimento;
  }

public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

public String getHomeWorld() {
    return homeworld;
  }

  public void setHomeworld(String homeworld) {
    this.homeworld = homeworld;
  }


	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int P = sc.nextInt();
	String[] Personagens = new String[P];
}