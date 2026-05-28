package Models;

import Enum.NivelUso;
import Interface.Preparable;
import java.util.Objects;

public class InstrumentosParaDeportesDeEquipo extends Equipamiento implements Preparable {

    private String tipoDeporte;

    public InstrumentosParaDeportesDeEquipo(String nombre, String sector, NivelUso uso, String tipoDeporte) {
        super(nombre, sector, uso);
        this.tipoDeporte = tipoDeporte;
    }

 

    @Override
    public void preprararParaUsoDiario() {
        System.out.println(getNombre() + " preparado para usar en " + getTipoDeporte() + "\n");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTipo de deporte: " + getTipoDeporte()  + "\n";
    }

    private String getTipoDeporte() {
        return tipoDeporte;
    }
}
