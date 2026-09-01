package Dados;

public class DadosCliente {

    private String nomeDoCliente;
    private int idadeDoCliente;
    private Long cpfDoCliente;

public DadosCliente(String nomeDoCliente, int idadeDoCliente, Long cpfDoCliente){// CONSTRUTOR, recebe os dados da main.

        this.nomeDoCliente = nomeDoCliente;
        // this.nomeDoCliente -> atributo da classe (fica guardado no objeto)
        // nomeDoCliente -> parâmetro recebido pelo construtor
        this.idadeDoCliente = idadeDoCliente;
        this.cpfDoCliente = cpfDoCliente;
    }

    public String getNomeDoCliente(){
        return nomeDoCliente;
        // Método getter: retorna o valor do atributo private nomeDoCliente.
        // return nomeDoCliente; devolve esse valor pra quem chamou.
    }

    public int getIdadeDoCliente(){
    return idadeDoCliente;
    }

    public Long getCpfDoCliente(){
    return cpfDoCliente ;
    }

    public void setNomeDoCliente(String nomeDoCliente){
    this.nomeDoCliente = nomeDoCliente;
    }

    public void setIdadeDoCliente(int idadeDoCliente){
    this.idadeDoCliente = idadeDoCliente;
    }

    public void setCpfDoCliente(Long cpfDoCliente){
    this.cpfDoCliente = cpfDoCliente;
    }

    //public void setCpfDoCliente = cpfDoCliente;

}
