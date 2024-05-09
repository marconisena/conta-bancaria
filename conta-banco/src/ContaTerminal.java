
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);


       // Solicitacão de dados da conta bancaria
       System.out.println("Digite o número da sua conta: ");
       int numero = scanner.nextInt();
       scanner.nextLine();
       System.out.println("Digite sua agencia:");
       String agencia = scanner.nextLine();
       System.out.println("Digite seu nome:");
       String nome = scanner.nextLine();
       System.out.println("Digite seu saldo");
       double saldo = scanner.nextDouble();
        String nomeCliente = null;

   // Criando objeto ContaBanco com os dados fornecidos
        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

        // Exibindo os dados da conta bancária
        System.out.println("\nDados da conta bancária:");
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Nome do Cliente: " + conta.getNomeCliente());
        System.out.println("Saldo: " + conta.getSaldo());

        scanner.close();
    }
}

class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public ContaBanco(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}



