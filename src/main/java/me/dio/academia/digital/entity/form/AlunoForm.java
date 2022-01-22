package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preencha o campo nome corretamente.")
  @Size(min = 3, max = 50, message = "'${ValidatedValue}' precisa ter tamanho mínimo de {min} e máximo de {max} caracteres.")
  private String nome;

  @NotBlank(message = "Preencha o campo CPF corretamente.")
  @CPF(message = "'${ValidateValue}' é inválido!")
  private String cpf;

  @NotBlank(message = "Preencha o campo bairro corretamente.")
  @Size(min = 3, max = 50, message = "'${ValidatedValue}' precisa ter tamanho mínimo de {min} e máximo de {max} caracteres.")
  private String bairro;

  @NotNull(message = "Preencha com a data correta")
  @Past(message = "Data '${ValidatedValue}' é inválida!")
  private LocalDate dataDeNascimento;
}
