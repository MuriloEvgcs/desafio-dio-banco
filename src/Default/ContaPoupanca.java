package Default;

public class ContaPoupanca extends Conta {
    public void imprimirExtrato(){
        System.out.println("====Extrato Conta corrente====");
        super.imprimirInfosComuns();
    }
}
