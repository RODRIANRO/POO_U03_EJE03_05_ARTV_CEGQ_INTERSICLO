/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author NOTEBOOK
 */
public class Departamento {
    
  private int codigo;
    private String Nombre;
    private Empleado gerente;
    private Empresa empresa;
    private String ubicacion;

    public Departamento(int codigo, String Nombre, Empresa empresa, String ubicacion) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.empresa = empresa;
        this.ubicacion = ubicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Empleado getGerente() {
        return gerente;
    }

    

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

   
    
    public void asignarGerente(Empleado gerente) {
        this.gerente = gerente;
    }
    
    public String mostrarInformacion(){
         if(this.gerente == null){
            return "Departamento{" + "codigo = " + codigo + ", Nombre = " + 
                    Nombre + ", gerente = " + "Sin gerente" + ","
                    + " empresa = " + empresa.getNombre() + ", ubicacion = " + ubicacion + '}';
            
        }
        return "Departamento{" + "codigo = " + codigo + ", Nombre = " + Nombre 
                + ", gerente = " + gerente.getNombre()+" : "+gerente.getCedula()
                + ", empresa = " + empresa.getNombre() + ", ubicacion = " + ubicacion + '}';
    }
    
}