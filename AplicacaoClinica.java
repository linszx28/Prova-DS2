/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Aluno
 */

 import java.util.Date;
import java.util.Scanner;

public class AplicacaoClinica {
    
    public static void main(String[] args) throws EValorInvalidoException {
       
        Clinica clinica = new Clinica("Senai Saúde", "Av Dendezeiros, 188, Bonfim", "CNPJ", 75.00, 150.00);

     
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirOpcoesMenu();

            
            String opcao = scanner.nextLine();

            switch (opcao.toLowerCase()) {
                case "a":
                    realizarAtendimento(scanner, clinica);
                    break;

                case "b":
                    consultarMediaAtendimentos(clinica);
                    break;

                case "c":
                    alterarValoresConsulta(scanner, clinica);
                    break;

                case "d":
                    encerrarPrograma();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirOpcoesMenu() {
        System.out.println("Opções:");
        System.out.println("a. Realizar atendimento");
        System.out.println("b. Consultar a média de valor dos atendimentos realizados");
        System.out.println("c. Alterar o valor da consulta simples ou o adicional para exames");
        System.out.println("d. Sair");
    }

    private static void realizarAtendimento(Scanner scanner, Clinica clinica) throws EValorInvalidoException {
        System.out.println("Informe o tipo de consulta (simples ou check-up): ");
        String tipoConsulta = scanner.nextLine();

  
        System.out.println("Informe o CPF do paciente: ");
        String cpf = scanner.nextLine();
        System.out.println("Informe o nome do paciente: ");
        String nomePaciente = scanner.nextLine();
        System.out.println("Informe a data de nascimento do paciente (dd/MM/yyyy): ");
        String dataNascimentoPaciente = scanner.nextLine();
        System.out.println("Informe o plano de saúde do paciente: ");
        String planoSaudePaciente = scanner.nextLine();

        
        Paciente paciente = new Paciente(cpf, nomePaciente, dataNascimentoPaciente, planoSaudePaciente);

        clinica.realizarAtendimento(tipoConsulta, paciente);
        System.out.println("Atendimento realizado com sucesso! Valor do Atendimento: " + clinica.getValorTotal());
    }

    private static void consultarMediaAtendimentos(Clinica clinica) {
        double media = clinica.getValorTotal() / clinica.getAtendimentosRealizados().size;
        System.out.println("Média de valor dos atendimentos realizados: " + media);
    }

    private static void alterarValoresConsulta(Scanner scanner, Clinica clinica) {
        System.out.println("Informe o novo valor da consulta simples: ");
        double novoValorSimples = Double.parseDouble(scanner.nextLine());
        System.out.println("Informe o novo valor adicional para exames: ");
        double novoValorAdicional = Double.parseDouble(scanner.nextLine());

        clinica.alterarValores(novoValorSimples, novoValorAdicional);
        System.out.println("Valores alterados com sucesso!");
    }

    private static void encerrarPrograma() {
        System.out.println("Encerrando o programa. Obrigado!");
        System.exit(0);
    }
}
  
