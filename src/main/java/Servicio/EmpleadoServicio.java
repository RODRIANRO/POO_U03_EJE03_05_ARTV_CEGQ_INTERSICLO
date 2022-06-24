/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import Modelo.Departamento;
import Modelo.Empleado;

/**
 *
 * @author NOTEBOOK
 */
public class EmpleadoServicio implements IEmpleadoServicio{
    private static final List<Empleado> listaEmpleados = new ArrayList<>();

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        return empleado;
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return listaEmpleados;
    }

    @Override
    public Empleado getEmpleadoByCedula(String cedula) {
        for (Empleado emp : listaEmpleados) {
            if(emp.getCedula().equals(cedula)){
                return emp;
            }
        }
        return null;
    }
    
    public void asignarDepartamento(String cedula, Departamento departamento){
        getEmpleadoByCedula(cedula).asignarDepartamento(departamento);
    }

    @Override
    public void actualizarEmpleado(String cedula, Empleado empleadoNuevo) {
        int posicion = getPositionEmpleado(getEmpleadoByCedula(cedula));
        listaEmpleados.get(posicion).setNombre(empleadoNuevo.getNombre());
        listaEmpleados.get(posicion).setNacionalidad(empleadoNuevo.getNacionalidad());
        listaEmpleados.get(posicion).setCargo(empleadoNuevo.getCargo());
        listaEmpleados.get(posicion).setSalario(empleadoNuevo.getSalario());
        listaEmpleados.get(posicion).setFechaNacimiento(empleadoNuevo.getFechaNacimiento());
        listaEmpleados.get(posicion).setDireccion(empleadoNuevo.getDireccion());
        listaEmpleados.get(posicion).asignarDepartamento(empleadoNuevo.getDepartamento());
    }

    @Override
    public Empleado eliminarEmpleado(String cedula) {
       var posicion = getPositionEmpleado(getEmpleadoByCedula(cedula));
       return listaEmpleados.remove(posicion);
    }

    @Override
    public int getPositionEmpleado(Empleado empleado) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (empleado.getCedula().equals(listaEmpleados.get(i).getCedula())) {
                return i;
            }
        }
        return -1;
    }

    public Object listarEmpresas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
    

