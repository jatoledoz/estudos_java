package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        
        p[0]= new Pessoa("Pedro", 22, "H");
        p[1]= new Pessoa("Maria", 25, "M");
        
        l[0]= new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1]= new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        
        l[1].abrir();
        l[1].folhear();
        l[1].avançarPagina();
        System.out.println(l[1].detalhes());
        l[1].voltarPagina();
        System.out.println(l[1].getPaginaAtual());
        
        p[0].fazerAniversario();
        System.out.println(p[0].getIdade());
    }
    
}
