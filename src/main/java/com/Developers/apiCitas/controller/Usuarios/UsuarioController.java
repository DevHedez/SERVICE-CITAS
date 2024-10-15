package com.Developers.apiCitas.controller.Usuarios;

import com.Developers.apiCitas.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Developers.apiCitas.Usuario.UsuarioInterfaceService;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioInterfaceService interfaceService;
    @GetMapping("usuarios")
    private ResponseEntity<List<Usuarios>> allUsuarios (){
        return ResponseEntity.ok(interfaceService.findAll());
    }
}
