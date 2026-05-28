package Exceptions;


public class EquipoNuloException extends NullPointerException {
    private final static String MESSAGE = "ERROR: Equipo nulo, verificar ingreso";
    
    public EquipoNuloException() {
        this(MESSAGE);
    }
    
    public EquipoNuloException(String message) {
        super(message);
    }
    
    
}