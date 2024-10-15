package com.Developers.apiCitas.repository;

import com.Developers.apiCitas.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuarios,Long> {

}
