package Models;

import Enum.NivelUso;
import java.util.Objects;

public abstract class Equipamiento {
    private String nombre;
    private String sector;
    private NivelUso uso;

    public Equipamiento(String nombre, String sector, NivelUso uso) {
        this.nombre = nombre;
        this.sector = sector;
        this.uso = uso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, sector);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || !(o instanceof Equipamiento e)){
            return false;
        }
        return nombre.equals(e.nombre) && sector.equals(e.sector);
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getSector() {
        return sector;
    }

    public NivelUso getUso() {
        return uso;
    }
    
    public boolean compararNivel(NivelUso n){
        return this.uso == n;
    }

    @Override
    public String toString() {
        return "Equipamiento \n" + "nombre: \n" + nombre + "sector: \n" + sector + "uso: \n" + uso;
    }
    
    
}
