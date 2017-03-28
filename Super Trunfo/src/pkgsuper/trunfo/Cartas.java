package pkgsuper.trunfo;
public class Cartas {
    private String nomeCarta;
    private int cilindradas;
    private int potencia;
    private int velocidadeMaxima;  
    
    public Cartas(String nome, int cc, int pot, int vel){
        this.nomeCarta = nome;
        this.cilindradas = cc;
        this.potencia = pot;
        this.velocidadeMaxima = vel;
    }

    public void setNomeCarta(String nomeCarta) {
        this.nomeCarta = nomeCarta;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }  

    public String getNomeCarta() {
        return nomeCarta;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }  
    
}