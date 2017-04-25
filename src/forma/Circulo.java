package forma;

public class Circulo implements Figura{
    private String nome;
     private double area;
    private double raio;
    
    @Override
    public String getNome() {
        this.nome = "Circulo";
        return nome;
    }

    @Override
    public double getArea() {
        area = Math.PI * (raio * raio);
        return area;
    }   

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
