package veiculos;

public abstract class Veiculo {
    public String modelo;
    public String marca;
    public boolean limpo;
    public abstract void roncoMotor();
    public void lavar(){
        System.out.println("Veículo está limpo agora!!!");
        setLimpo(true);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
    
}
