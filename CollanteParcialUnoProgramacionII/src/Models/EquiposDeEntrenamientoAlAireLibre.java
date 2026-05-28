package Models;

import Enum.NivelUso;
import java.util.Objects;

public class EquiposDeEntrenamientoAlAireLibre extends Equipamiento {

    private final int RESISTENCIA_MIN = 1;
    private final int RESISTENCIA_MAX = 10;
    private int resistenciaClima;

    public EquiposDeEntrenamientoAlAireLibre(String nombre, String sector, NivelUso uso, int resistencia) {
        super(nombre, sector, uso);
        this.resistenciaClima = validarResistenciaClima(resistencia);
    }

    private int validarResistenciaClima(int r) {
        if (r < RESISTENCIA_MIN) {
            return RESISTENCIA_MIN;
        }
        if (r > RESISTENCIA_MAX) {
            return RESISTENCIA_MAX;
        }
        return r;
    }

    public int getResistenciaClima() {
        return resistenciaClima;
    }

    @Override
    public String toString() {
        return super.toString()+ "EquiposDeEntrenamientoAlAireLibre{" + "RESISTENCIA_MIN=" + RESISTENCIA_MIN + ", RESISTENCIA_MAX=" + RESISTENCIA_MAX + ", resistenciaClima=" + resistenciaClima + '}';
    }

     

}
