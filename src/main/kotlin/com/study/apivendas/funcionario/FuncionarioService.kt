package com.study.apivendas.funcionario

import org.springframework.stereotype.Service

@Service
class FuncionarioService(private val funcionarioRepository: FuncionarioRepository) {

    fun adicionar(funcionario: Funcionario): String? {
        funcionarioRepository.save(funcionario)

        return funcionario.id
    }

    fun listarTodos():List<Funcionario>{
        return funcionarioRepository.findAll()
    }

}