package CreateAccount;

import Dados.DadosCliente;

public class Create {

    private DadosCliente cliente;
    private double saldo;

    public Create(DadosCliente cliente, double saldo){
    this.cliente = cliente;
    this.saldo = saldo;
    }

    public DadosCliente getCliente() {
        return cliente;
    }

    public double getSaldo(){
        return saldo;
    }
}
