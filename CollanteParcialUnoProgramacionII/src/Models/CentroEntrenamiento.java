package Models;

import Enum.NivelUso;
import Exceptions.EquipoDuplicadoException;
import Exceptions.EquipoNuloException;
import Interface.Preparable;
import java.util.ArrayList;
import java.util.List;

public class CentroEntrenamiento {

    private List<Equipamiento> equipamientos = new ArrayList<>();

    public void agregarEquipo(Equipamiento e) {
        validarEquipo(e);
        equipamientos.add(e);
    }

    private void validarEquipo(Equipamiento e) {
        if (e == null) {
            throw new EquipoNuloException();
        }
        for (Equipamiento equipamiento : equipamientos) {
            if (equipamientos.contains(e)) {
                throw new EquipoDuplicadoException();
            }
        }
    }

    public void mostrarEquipos() {
        if (equipamientos.isEmpty()) {
            System.out.println("Sin equipos para mostrar actualmente");
        } else {
            for (Equipamiento e : equipamientos) {
                System.out.println(e.toString());
            }
        }
    }

    public void prepararEquipos() {
        System.out.println("----Preparando Equipamento----");
        for (Equipamiento e : equipamientos) {
            if (e instanceof Preparable p) {
                p.preprararParaUsoDiario();
            } else {
                System.out.println(e.getNombre() + " es un equipo para entrenar al aire libre y no necesita ser preparado \n");
            }
        }
    }

    public void filtrarPorNivelUso(NivelUso n) {
        List<Equipamiento> filtrados = new ArrayList<>();
        for (Equipamiento e : equipamientos) {
            if (e.compararNivel(n)) {
                filtrados.add(e);
            }
        }
        for (Equipamiento e : filtrados) {
            System.out.println(e.toString());
        }
    }
}
