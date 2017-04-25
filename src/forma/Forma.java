package forma;
public class Forma {    
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.setLado(5);
        System.out.println("Nome: "+q.getNome()+"\nÁrea: "+q.getArea());
        Triangulo t = new Triangulo();
        t.setBase(5);
        t.setAltura(12);
        System.out.println("\nNome: "+t.getNome()+"\nÁrea: "+t.getArea());
        Circulo c = new Circulo();
        c.setRaio(15);
        System.out.println("\nNome: "+c.getNome()+"\nÁrea: "+c.getArea());
    }    
}
