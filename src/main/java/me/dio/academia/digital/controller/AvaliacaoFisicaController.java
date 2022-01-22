package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoFisicaService;

    @GetMapping
    public List<AvaliacaoFisica> getAllAvaliacao(){
        return avaliacaoFisicaService.getAll();
    }

    @PostMapping
    public AvaliacaoFisica createAvaliacao(@Valid @RequestBody AvaliacaoFisicaForm avaliacaoFisicaForm){
        return avaliacaoFisicaService.create(avaliacaoFisicaForm);
    }
}
