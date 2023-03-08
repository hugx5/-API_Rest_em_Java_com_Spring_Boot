package Alura.Aplication.API.medico;

import Alura.Aplication.API.Endereco.DadosEndereço;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereço endereco) {
}
