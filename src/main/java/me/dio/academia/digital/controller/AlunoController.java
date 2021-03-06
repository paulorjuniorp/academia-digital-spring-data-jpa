package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;

    @GetMapping
    public List<Aluno> getAllAluno(@RequestParam(value = "dataDeNascimento",required = false)String dataDeNascimento){

        return alunoService.getAll(dataDeNascimento);
    }

    @PostMapping
    public Aluno createAluno(@Valid @RequestBody AlunoForm alunoForm){
        return alunoService.create(alunoForm);
    }

    @GetMapping("/avaliacoes/{idAluno}")
    List<AvaliacaoFisica> getAvaliacaoFisica(@PathVariable Long idAluno){
        return alunoService.getAllAvaliacaoFisica(idAluno);
    }
}
