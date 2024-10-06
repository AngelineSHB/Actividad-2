/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author astef
 */

import java.util.ArrayList;
import java.util.List;

public class AlumnoArray {
    private List<Alumno> listaAlumnos;

    // Constructor
    public AlumnoArray() {
        listaAlumnos = new ArrayList<>();
    }
    // Método para agregar un alumno a la lista
    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    // Método para eliminar un alumno de la lista por su código
    public void eliminarAlumno(String codigo) {
        listaAlumnos.removeIf(alumno -> alumno.getCodigo().equals(codigo));
    }
    // Método para actualizar un alumno en la lista
    public void actualizarAlumno(String codigo, Alumno alumnoModificado) {
        for (int i = 0; i < listaAlumnos.size(); i++) {
            Alumno alumno = listaAlumnos.get(i);
            if (alumno.getCodigo().equals(codigo)) {
                listaAlumnos.set(i, alumnoModificado);
                break;
            }
        }
    }

    // Método para obtener la lista de alumnos
    public List<Alumno> obtenerListaAlumnos() {
        return listaAlumnos;
    }
    // Método para buscar un alumno por su código
    public Alumno buscarAlumnoPorCodigo(String codigo) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCodigo().equals(codigo)) {
                return alumno;
            }
        }
        return null; // Retorna null si no encuentra el alumno
    }
}
