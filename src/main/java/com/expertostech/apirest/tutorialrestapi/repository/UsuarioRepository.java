package com.expertostech.apirest.tutorialrestapi.repository;

import org.springframework.data.repository.CrudRepository;
import com.expertostech.apirest.tutorialrestapi.model.UsuarioModel;

//interface suficiente para fazer consultas basicas no banco de dados
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{

}
