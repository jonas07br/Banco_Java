package Banco.App.Conta;
/**
 * <h1>Cliente</h1>
 * A classe possui 4 atributos privados(nome,numConta,agencia e saldo)
 * <p>
 * Cada atributo possui seu respectivo método SET
 * @author Jonas Rafael
 * @version 1.0
 */

public class Cliente {
    //Atributos-----------------
    private String nomeCliente;
    private String agencia;
    private int numConta;
    private float saldo;

    //Construtor padrão
    public Cliente(){
        nomeCliente="ABCABC";
        agencia="123-ABC";
        numConta=00000;
        saldo=0;
    }

    //Construtor com parâmetros
    public Cliente(String nome,int num,String agencia_,float saldo_){
        nomeCliente = nome;
        numConta = num;
        agencia=agencia_;
        saldo = saldo_;

    }

    //DEFS_SET---------------------------------
    public void setNomeCliente(String nome){
        nomeCliente = nome;
    }
    public void setNumConta(int num){
        numConta = num;
    }
    public void setAgencia(String agencia_){
        agencia=agencia_;
    }
    public void setSaldo(float saldo_){
        saldo = saldo_;
    }

    //DEFS_GET---------------------------------
    public String getNomeCliente(){
        return nomeCliente;
    }
    public int getNumConta(){
        return numConta;
    }
    public String getAgencia(){
        return agencia;
    }
    public float getSaldo(){
        return saldo;
    }
    
}