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
public class ContaCorrente extends Conta{
    private double anuidade;

    public ContaCorrente(float anuidade, String ntitular, String rg, String cpf, double saldo) {
        super(ntitular, rg, cpf, saldo);
        this.anuidade = anuidade;
    }

    public double getAnuidade() {
        return anuidade;
    }

    public void setAnuidade(double anuidade) {
        this.anuidade = anuidade;
    }    
    
}
