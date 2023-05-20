package com.study.apivendas.funcionario

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "funcionarios")
class Funcionario(@Id var id: String?, var nome: String, var cargo: String, var senha: String) {

}