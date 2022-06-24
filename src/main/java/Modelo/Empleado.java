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
public class Empleado {
    
  private String cedula;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private String direccion;
    private String cargo;
    private float salario;
    private LocalDate fechaEntrada;
    private Departamento departamento;

    public Empleado(String cedula, String nombre, LocalDate fechaNacimiento, String nacionalidad, String direccion, String cargo, float saliario, LocalDate fechaEntrada, Departamento departamento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.cargo = cargo;
        this.salario = saliario;
        this.fechaEntrada = fechaEntrada;
        this.departamento = departamento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    

    @Override
    public String toString() {
        if(this.departamento == null){
            return "Empleado{" + "cedula = " + cedula + ", nombre = " + nombre + ", fechaNacimiento = " + fechaNacimiento + ", nacionalidad = " + nacionalidad + ", direccion = " + direccion + ",\n cargo=" + cargo + ", salario=" + salario + ", fechaEntrada = " + fechaEntrada + ", departamento = Sin Asignar ";
        }
        return "Empleado{" + "cedula = " + cedula + ", nombre = " + nombre + ", fechaNacimiento = " + fechaNacimiento + ", nacionalidad = " + nacionalidad + ", direccion = " + direccion + ",\n cargo = " + cargo + ", salario = " + salario + ", fechaEntrada = " + fechaEntrada + ", departamento = " + departamento.getNombre()+" ";
    }
    
    public int calcularEdad(int anioActual){
        int edad = anioActual - this.fechaNacimiento.getYear();
        return edad;
    }
    
    
    public void asignarDepartamento ( Departamento departamento) {
        this.departamento = departamento;
    }
    
    public String mostrarInformacion(int anioActual){
        String info = toString() + "\nedad actual empleado: "+calcularEdad(anioActual)+" años }";
        return info;
    }
    
    
    
}
