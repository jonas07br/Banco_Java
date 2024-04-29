package Banco.App.Terminal;

import java.util.Scanner;
import Banco.App.Conta.Cliente;

@SuppressWarnings("resource")

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Olá, seja bem vindo ao Banco Java!");
        System.out.println("Vamos criar sua conta!");

        System.out.print("Informe seu nome:");
        cliente.setNomeCliente(scan.nextLine());

        System.out.println();

        System.out.print("Informe sua Agencia:");
        cliente.setAgencia(scan.nextLine());

        System.out.println();

        System.out.print("Informe o número da sua conta:");
        cliente.setNumConta(scan.nextInt());

        System.out.println();

        System.out.print("Informe seu saldo:");
        cliente.setSaldo(scan.nextFloat());


        System.out.print("Olá "+cliente.getNomeCliente());
        System.out.print(", obrigado por criar sua conta no Banco Java.");
        System.out.print(" Sua agência é:"+cliente.getAgencia());
        System.out.print(", sua conta é:"+cliente.getNumConta());
        System.out.print(" e seu saldo de R$"+cliente.getSaldo()+" já está disponivel para saque.");
        System.out.println();
        }
    }

