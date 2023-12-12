/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
    public class Checkup extends Consulta {
    private double valorAdicional;

    public Checkup(Paciente paciente, String data, String localAtendimento, double valorConsulta, double valorAdicional) throws EValorInvalidoException {
        super(paciente, data, localAtendimento, valorConsulta);
        if (valorAdicional < 0) {
            throw new EValorInvalidoException("Valor adicional inválido");
        }
        this.valorAdicional = valorAdicional;
    }

    // Getter específico para o valor adicional

    public double getValor() {
        return super.getValorConsulta() + valorAdicional;
    }

    private static class EValorInvalidoException extends Exception {

        public EValorInvalidoException(String valor_adicional_inválido) {
        }
    }
}

