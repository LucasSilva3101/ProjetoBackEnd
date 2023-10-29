package CRUD.API.medico;

import CRUD.API.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(
        @NotBlank //campo obrigatório e não nulo (para Strings)
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //uma expressão regular crm deve conter de 4 a 6 digitos
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull
        @Valid //validar objeto como atributo
        DadosEndereco endereco) {



}
