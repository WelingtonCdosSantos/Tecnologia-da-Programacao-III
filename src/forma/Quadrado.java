package forma;
public class Quadrado implements Figura{
    private String nome;
     private double area;
    private double lado;
    
    
    @Override
    public String getNome() {
        nome = "Quadrado";
        return nome;
    }

    @Override
    public double getArea() {
        return this.lado * this.lado;
    }    

    public void setLado(double lado) {
        this.lado = lado;
    }    
}
