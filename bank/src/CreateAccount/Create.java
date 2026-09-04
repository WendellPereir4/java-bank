package CreateAccount;

import Dados.DadosCliente;

public class Create {

    private DadosCliente cliente;

    public Create(DadosCliente cliente, double saldo) {

        if (cliente.getIdadeDoCliente() < 18) {
            System.out.println("Você precisa ter 18 anos ou mais para criar uma conta.");
            return;
        }

        this.cliente = cliente;

        System.out.println("Conta criada com sucesso!");
    }

    public DadosCliente getCliente() {
        return cliente;
    }
}