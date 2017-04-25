package veiculos;
public class Veiculos {

    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo v = new Carro();
       v.setMarca("Toyota");
       v.setModelo("Supra");
       
        System.out.println(v.getMarca() + " "+v.getModelo()+"\nLimpo : "+v.getLimpo());
        System.out.println("Lavando .......");
        v.lavar();
        System.out.println("Limpo: "+v.getLimpo());
        v.roncoMotor();
        
        Veiculo m = new Moto();
        m.setMarca("Yamaha");
        m.setModelo("XJ6");
        
        System.out.println("\n\n"+m.getMarca() + " "+m.getModelo()+"\nLimpo : "+m.getLimpo());
        System.out.println("Lavando .......");
        m.lavar();
        System.out.println("Limpo: "+m.getLimpo());
        m.roncoMotor();
    }
    
}
