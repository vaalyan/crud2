package com.app.web.crud2.Controlador;

import com.app.web.crud2.Repositorio.EstudianteRepositorio;
import com.app.web.crud2.entidad.Estudiante;
import com.app.web.crud2.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio servicio;

    @GetMapping({"/estudiantes"})
    public String listarEstudiantes(Model modelo) {
        modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
        return "estudiantes";
    }
}
