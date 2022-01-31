package DesafioDioBanco;

public class Main {

    public static void main(String[] args) {
        Cliente augusto = new Cliente();
        augusto.setNome("Augusto");

        Conta cc = new ContaCorrente(augusto);
        Conta poupanca = new ContaPoupanca(augusto);

        /* Exemplo de movimentação */
        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
