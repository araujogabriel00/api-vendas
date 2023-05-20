package com.study.apivendas.funcionario

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface FuncionarioRepository : MongoRepository<Funcionario, Long> {
}