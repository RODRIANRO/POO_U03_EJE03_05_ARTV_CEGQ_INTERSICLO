/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author NOTEBOOK
 */
public class Empresa {
    private int codigo;
    private String nombre;
    private String nombreFundador;
    private String pais;
    private String direccion; //(matriz principal)
    private LocalDate fechaFundacion;

    public Empresa(int codigo, String nombre, String nombreFundador, String pais, String direccion, LocalDate fechaFundacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nombreFundador = nombreFundador;
        this.pais = pais;
        this.direccion = direccion;
        this.fechaFundacion = fechaFundacion;
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

    public String getNombreFundador() {
        return nombreFundador;
    }

    public void setNombreFundador(String nombreFundador) {
        this.nombreFundador = nombreFundador;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    

    @Override
    public String toString() {
        return "Empresa{" + "codigo = " + codigo + ", nombre = " + nombre 
                + ", nombreFundador = " + nombreFundador + ", pais = " 
                + pais + ",\n direccion = " + direccion + ", fechaFundacion = " + fechaFundacion ;
    }
     
    public int mostrarAntiguedadEmpresa(int anioActual){
        
        int anioFundacion = this.fechaFundacion.getYear();
        int antiguedad = anioActual - anioFundacion;
        return antiguedad;
    }
    
    public String mostrarInformacion(int anioActual){
        String infoEmpresa = this.toString() + ", Antiguedad: "+mostrarAntiguedadEmpresa(anioActual)+" años }";
        return infoEmpresa;
    }
}

