package edu.mateus.komorebi.modelos;

public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    // Construtor --------------------------------
    public ContaBancaria(String nome, int numero, String agencia) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        saldo = 0;
    }

    // Getters -----------------------------------
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    // Métodos -----------------------------------
    /**
     *
     * <p>Método que permite qualquer pessoa injetar dinheiro em sua propria conta.</p>
     * <p>Easy money.</p>
     *
     * @param valor Valor que será injetado na conta.
     * @author      Mateus Simões Rosa
     *
     */
    public void receber(double valor) {
        saldo += valor;
    }

    /**
     *
     * <p>Método responsável pela função de remover o dinheiro da conta.</p>
     *
     * @param valor Valor que será sacado da conta.
     * @author      Mateus Simões Rosa
     *
     */
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("\n ************************************************** ");
            System.out.println("   Saldo insuficiente...");
            System.out.println(" ************************************************** \n");
        }
    }

    public boolean validarConta(int numero, String agencia) {
        if (this.numero == numero && this.agencia.equals(agencia)) {
            return true;
        } else {
            return false;
        }
    }
}
