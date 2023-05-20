package com.study.apivendas.funcionario

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("funcionario")
class FuncionarioController(private val funcionarioService: FuncionarioService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun adicionar(@RequestBody funcionario: Funcionario): ResponseEntity<String?> {
        val funcionario = funcionarioService.adicionar(funcionario)
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario)
    }

    @GetMapping
    fun listarTodos(): ResponseEntity<List<Funcionario>> {
        return ResponseEntity(this.funcionarioService.listarTodos(), HttpStatus.OK)
    }
}