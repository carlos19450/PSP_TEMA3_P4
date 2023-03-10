package com.dam.proyectospring.servicios;

import com.dam.proyectospring.modelos.Piloto;

import java.util.List;

public interface PilotoServicio {
    List<Piloto> findAllPilotos();
    Piloto findPilotoByID(String id);
    Piloto createPiloto(Piloto piloto);
    Piloto updatePiloto(Piloto piloto);
    Piloto deletePiloto(String id);
}
