package Banco.App.Conta;
public class Cliente {
    //Atributos-----------------
    private String nomeCliente;
    private String agencia;
    private int numConta;
    private float saldo;

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