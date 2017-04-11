/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Welington
 */
public class ContaPoupanca extends Conta{
    private double rendimento;

    public ContaPoupanca(double rendimento, String ntitular, String rg, String cpf, double saldo) {
        super(ntitular, rg, cpf, saldo);
        this.rendimento = rendimento;
    }  

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    
}
