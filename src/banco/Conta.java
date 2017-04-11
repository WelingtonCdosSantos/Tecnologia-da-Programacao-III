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
public class Conta {
    private String ntitular;
    private String rg;
    private String cpf;
    private double saldo;

    public Conta(String ntitular, String rg, String cpf, double saldo) {
        this.ntitular = ntitular;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
    }
    public void deposita(double valor){
        this.setSaldo(this.getSaldo()+valor);
    }
    public void saca (double valor){
        this.setSaldo(this.getSaldo()-valor);
        
    }
    public String getNtitular() {
        return ntitular;
    }

    public void setNtitular(String ntitular) {
        this.ntitular = ntitular;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }   
            
}
