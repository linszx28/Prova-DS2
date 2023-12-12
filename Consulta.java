/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */



import java.util.Date;

public class Consulta {
    protected Paciente paciente;
    protected Date dataAtendimento;
    protected String localAtendimento;
    protected double valor;

    public Consulta(Paciente paciente, String localAtendimento, double valor) {
        this.paciente = paciente;
        this.dataAtendimento = new Date(); // Current date and time
        this.localAtendimento = localAtendimento;
        this.valor = (valor < 20) ? 50 : valor;
    }

    public String consultarInformacoes() {
        return "Paciente: " + paciente.consultarInformacoes() +
                "\nData do Atendimento: " + dataAtendimento +
                "\nLocal do Atendimento: " + localAtendimento +
                "\nValor da Consulta: " + valor;
    }

    public double consultarValor() {
        return valor;
    }

    double getValorConsulta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}  
