/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */


import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nome;
    private String endereco;
    private String cnpj;
    private double valorConsultaSimples;
    private double valorAdicionalExames;
    private List<Consulta> atendimentosRealizados;

    public Clinica(String nome, String endereco, String cnpj, double valorConsultaSimples, double valorAdicionalExames) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.valorConsultaSimples = (valorConsultaSimples < 0) ? 0 : valorConsultaSimples;
        this.valorAdicionalExames = (valorAdicionalExames < 0) ? 0 : valorAdicionalExames;
        this.atendimentosRealizados = new ArrayList<>();
    }
    public double getValorTotal() {
        return atendimentosRealizados.stream().mapToDouble(Consulta::consultarValor).sum();
    }
    public void alterarValores(double novoValorConsultaSimples, double novoValorAdicionalExames) {
        this.valorConsultaSimples = (novoValorConsultaSimples < 0) ? 0 : novoValorConsultaSimples;
        this.valorAdicionalExames = (novoValorAdicionalExames < 0) ? 0 : novoValorAdicionalExames;
    }

    public void realizarAtendimento(Consulta atendimento) {
        atendimentosRealizados.add(atendimento);
    }

    void realizarAtendimento(String tipoConsulta, Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getAtendimentosRealizados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}