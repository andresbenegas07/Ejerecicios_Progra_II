package Models;

import Enum.NivelUso;
import Interface.Preparable;

public class AparatosDeGimnasio extends Equipamiento implements Preparable{
    private final double pesoMaximo;

    public AparatosDeGimnasio(String nombre, String sector, NivelUso uso, double pesoMaximo) {
        super(nombre, sector, uso);
        this.pesoMaximo = validarPesoMaximo(pesoMaximo);
    }
    
    private double validarPesoMaximo(double p){
        if(p <= 0){
            throw new IllegalArgumentException("Error en el peso cargado");
        }
        return p;
    }

    @Override
    public void preprararParaUsoDiario() {
        System.out.println(getNombre() + " preparado para usar en el sector " + getSector() + "\n");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nPeso maximo recomendado: " + pesoMaximo + "\n";
    }
}
