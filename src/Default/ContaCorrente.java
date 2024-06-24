package Default;

public class ContaCorrente extends Conta {
    public void imprimirExtrato(){
        System.out.println("====Extrato Conta corrente====");
        super.imprimirInfosComuns();
    }
}

