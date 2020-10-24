package aula07e08_uec;
public class Lutador implements ControladorLutador{
    
    //Attributes
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private float altura, peso;
    private int vitorias, derrotas, empates;

    //Abstracts
    
    @Override
    public void apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m  de altura");
        System.out.println("Pesando: " + this.getPeso() + " kg ");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println(this.getNome() + " e um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");

    }

    @Override
    public void ganharLuta() {
        this.setVitorias( this.getVitorias() + 1 );
    }
    
    @Override
    public void perderLuta() {
        this.setDerrotas( this.getDerrotas() + 1 );
    }

    @Override
    public void empatarLuta() {
        this.setEmpates( this.getEmpates() + 1 );
    }
    
    
    //Constructor

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso <= 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Medio";
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
