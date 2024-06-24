package Default;
public class Banco {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        Conta cpp = new ContaPoupanca();

        cpp.imprimirExtrato();
        cc.imprimirExtrato();

        cc.depositar(150.21);
        cc.imprimirExtrato();
        cc.transferir(120, cpp);
        cc.imprimirExtrato();
        cpp.imprimirExtrato();
    }
}
