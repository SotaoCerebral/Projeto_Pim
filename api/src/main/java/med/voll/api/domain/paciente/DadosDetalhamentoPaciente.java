package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.PacienteEndereco;

public record DadosDetalhamentoPaciente(String nome, String email, String cpf, String telefone, PacienteEndereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone(), paciente.getEndereco());
    }
}
