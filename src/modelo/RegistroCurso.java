/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author gollo011
 */
public class RegistroCurso {
    
    ArrayList<Curso> listaCursos;
    
    public RegistroCurso () {
        listaCursos= new ArrayList<Curso>();
    }
    
    public String addCurso(Curso curso){
        if (curso != null) {
            if (verificarSigla(curso.getSigla())) {
                listaCursos.add(curso);
                return "El curso fue agregado correctamente";
            } else {
                return "El curso se encuentra registrado!";
            }
        }
        return "El objeto es null!";
    }
    
    public boolean verificarSigla(String sigla) {
        if (!sigla.equalsIgnoreCase("")) {
            if (listaCursos.size() != 0) {
                for (int index = 0; index < listaCursos.size(); index++) {
                    if (listaCursos.get(index).getSigla().equals(sigla)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public Curso consultar(String sigla) {

        for (Curso curso : listaCursos) {
            if (curso.getSigla().equalsIgnoreCase(sigla)) {

                return curso;
            }
        }

        return null;
    }
}
