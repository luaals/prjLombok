package com.luana.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luana.lombok.projetoLombok.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}