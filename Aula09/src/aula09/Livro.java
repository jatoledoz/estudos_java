package aula09;

import java.util.Random;

public class Livro implements ControllerPublicacao{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    // Methods
    
    public String detalhes() {
        return "### Livro ###" + "\nTitulo: " + titulo + " - Autor: " + autor + ", \nTotal de Paginas: " + totalPaginas + 
                " - Pagina Atual: " + paginaAtual + ". \nAberto? " + aberto + ". \nLeitor: " + leitor.getNome() + " " + leitor.getIdade() + " anos - Sexo:" + leitor.getSexo();
    }
   
    //Abstract
    
    @Override
    public void abrir() {
        if (this.isAberto()) {
            System.out.println("Livro ja esta aberto");
        } else {
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
        } else {
            System.out.println("Livro ja esta fechado");
        }
    }

    @Override
    public void folhear() {
        Random randomNumber = new Random();
        this.setPaginaAtual(randomNumber.nextInt(this.getTotalPaginas()));
        System.out.println("Pagina folheada: " + this.getPaginaAtual());
    }

    @Override
    public void avançarPagina() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        } else {
            System.out.println("Livro Fechado. Impossivel avançar pagina");
        }
    }

    @Override
    public void voltarPagina() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        } else {
            System.out.println("Livro Fechado. Impossivel voltar pagina");
        }
    }
    
    //Constructor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.paginaAtual = 0;
    }
    
    //Getters & Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    
    
}
