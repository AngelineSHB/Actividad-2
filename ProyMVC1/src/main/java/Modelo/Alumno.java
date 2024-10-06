/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author astef
 */
public class Alumno {
    
    private String codigo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private int edad;
     // Constructor vacío
    public Alumno() {
    }
    
    // Constructor con parámetros
    public Alumno(String codigo, String nombre, String apellido, Date fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(fechaNacimiento);
    }
     // Getters y Setters
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(fechaNacimiento); // Actualizar edad cuando se cambia la fecha de nacimiento
    }

    public int getEdad() {
        return edad;
    }
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    // Elimina la llamada a txtCodigoActionPerformed(evt);
}

    // Método para calcular la edad basado en la fecha de nacimiento
    private int calcularEdad(Date fechaNacimiento) {
        if (fechaNacimiento == null) {
            return -1;
        }
     java.util.Calendar fechaNac = java.util.Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        java.util.Calendar fechaActual = java.util.Calendar.getInstance();
        int edad = fechaActual.get(java.util.Calendar.YEAR) - fechaNac.get(java.util.Calendar.YEAR);

        // Ajuste si el cumpleaños aún no ha ocurrido en el año actual
        if (fechaActual.get(java.util.Calendar.DAY_OF_YEAR) < fechaNac.get(java.util.Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        
        return edad;
    }
}
