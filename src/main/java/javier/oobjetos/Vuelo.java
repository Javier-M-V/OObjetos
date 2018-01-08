/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javier.oobjetos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alumno
 */
public class Vuelo {
    
    private String identidificador;
    private String aeropuerto_origen;
    private String aeropuerto_destino;
    private Set <Pasajeros> pasajerosSet = new HashSet(0);
    private Set <Tripulacion> tripulacionSet = new HashSet(0);

    public Vuelo(String identidificador, String aeropuerto_origen, String aeropuerto_destino) {
        this.identidificador = identidificador;
        this.aeropuerto_origen = aeropuerto_origen;
        this.aeropuerto_destino = aeropuerto_destino;
    }

    public String getIdentidificador() {
        return identidificador;
    }

    public void setIdentidificador(String identidificador) {
        this.identidificador = identidificador;
    }

    public String getAeropuerto_origen() {
        return aeropuerto_origen;
    }

    public void setAeropuerto_origen(String aeropuerto_origen) {
        this.aeropuerto_origen = aeropuerto_origen;
    }

    public String getAeropuerto_destino() {
        return aeropuerto_destino;
    }

    public void setAeropuerto_destino(String aeropuerto_destino) {
        this.aeropuerto_destino = aeropuerto_destino;
    }

    public Set<Pasajeros> getPasajerosSet() {
        return pasajerosSet;
    }

    public void setPasajerosSet(Set<Pasajeros> pasajerosSet) {
        this.pasajerosSet = pasajerosSet;
    }

    public Set<Tripulacion> getTripulacionSet() {
        return tripulacionSet;
    }

    public void setTripulacionSet(Set<Tripulacion> tripulacionSet) {
        this.tripulacionSet = tripulacionSet;
    }
    
    
    
}
