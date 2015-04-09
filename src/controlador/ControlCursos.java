/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Curso;
import modelo.RegistroCurso;
import vista.GUICursos;


/**
 *
 * @author gollo011
 */
public class ControlCursos implements ActionListener{
    private RegistroCurso registro;
    private GUICursos guiCurso;

    public ControlCursos(RegistroCurso registro, GUICursos guiCurso){
        this.registro = registro;
        this.guiCurso = guiCurso;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getActionCommand().equalsIgnoreCase(GUICursos.BTN_AGREGAR)){
            if (guiCurso.getTxtSigla().toString().equalsIgnoreCase("")) {
                GUICursos.mensaje("El campo carnet no tiene información, por favor, agregue el carnet del estudiante!");
            } else if (guiCurso.getTxtNombre().toString().equalsIgnoreCase("")) {
                GUICursos.mensaje("El campo nombre no tiene información, por favor, agregue el nombre del estudiante!");
            } else if (guiCurso.getTxtCreditos() == 0) {
                GUICursos.mensaje("El campo edad no tiene información, por favor, agregue la edad del estudiante!");

            } else {
                GUICursos.mensaje(
                        registro.addCurso(
                                new Curso(guiCurso.getTxtNombre(), guiCurso.getTxtSigla(), guiCurso.getTxtCreditos())));
                guiCurso.limpiar();
            }

        }//Fin btnAgregar
        
        
        
        
    }
    
    public void nada(){
        
    }
    
}

