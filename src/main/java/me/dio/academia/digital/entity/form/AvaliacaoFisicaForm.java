package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "O id do aluno deve ser positivo")
  private Long alunoId;

  @NotNull(message = "Preencha o peso corretamente.")
  @Positive(message = "O peso não pode ser negativo.")
  private double peso;

  @NotNull(message = "Preencha a altura corretamente.")
  @Positive(message = "A altura não pode ser negativa")
  @DecimalMin(value = "80")
  private double altura;
}
