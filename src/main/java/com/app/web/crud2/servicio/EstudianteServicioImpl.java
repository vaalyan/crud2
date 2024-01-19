package com.app.web.crud2.servicio;

import com.app.web.crud2.Repositorio.EstudianteRepositorio;
import com.app.web.crud2.entidad.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServicioImpl implements EstudianteServicio{
    @Autowired
    private EstudianteRepositorio repositorio;
    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {

        return repositorio.findAll();
    }
}
