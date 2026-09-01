package Main;

import Dados.DadosCliente;

import java.util.Scanner;

public class Main {
  static void main(String[] args) {

    Scanner fc = new Scanner(System.in);
    DadosCliente cliente = new DadosCliente("Seu nome:", 1,221111111L);

    //System.out.println("Seu nome completo é: " + cliente.getNomeDoCliente());
    //String nome = fc.nextLine();


    System.out.println("Seu nome completo é: " + cliente.getNomeDoCliente());
    System.out.println("Sua idade é: "+ cliente.getIdadeDoCliente());
    System.out.println("Seu cpf é:  "+ cliente.getCpfDoCliente());

    //Car car = new Car("BMW", "X6", 2024, 125000+12500); //-> new cria objetos, exem: BMW, x6, 2024. tipo uma pessoa fisica colocar idade,nome

  }
}