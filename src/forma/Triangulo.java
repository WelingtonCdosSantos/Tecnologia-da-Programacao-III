package forma;

public class Triangulo implements Figura{
    private String nome;
    private double area;
    private double base;
    private double altura;    
    
    @Override
    public String getNome() {
        this.nome = "Triangulo";
        return nome;
    }  
    @Override
    public double getArea() {
        this.area = (base * altura) /2;
        return this.area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
