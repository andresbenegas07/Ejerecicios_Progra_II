package Exceptions;

public class EquipoDuplicadoException extends IllegalStateException {
    private final static String MESSAGE = "ERROR: Mismo equipo, en el mismo sector";
    
    public EquipoDuplicadoException() {
        this(MESSAGE);
    }
    
    public EquipoDuplicadoException(String message) {
        super(message);
    }
    
    
}

