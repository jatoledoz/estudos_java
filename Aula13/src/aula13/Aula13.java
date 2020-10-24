package aula13;
public class Aula13 {
    public static void main(String[] args) {
     
        Cachorro c = new Cachorro();
        c.reagir("Ola");
        c.reagir("Pra fora");
        System.out.println("\n");
        c.reagir(11, 0);
        c.reagir(18, 0);
        c.reagir(14, 0);
        System.out.println("\n");
        c.reagir(true);
        c.reagir(false);
        System.out.println("\n");
        c.reagir(2, 9f);
        c.reagir(3, 11f);
        c.reagir(6, 5f);
        c.reagir(7, 13f);
    }
}
