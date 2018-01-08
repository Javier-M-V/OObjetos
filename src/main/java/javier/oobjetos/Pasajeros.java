/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javier.oobjetos;

/**
 *
 * @author Alumno
 */
public class Pasajeros {
    private int codigo;
    private String nombre;
    private String tel;
    private String direccion;

    public Pasajeros(int codigo, String nombre, String tel, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tel = tel;
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
