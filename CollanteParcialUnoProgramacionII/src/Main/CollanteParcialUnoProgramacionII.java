package Main;

import Enum.NivelUso;
import static Enum.NivelUso.ALTA;
import static Enum.NivelUso.BAJA;
import static Enum.NivelUso.MEDIA;
import Exceptions.EquipoDuplicadoException;
import Exceptions.EquipoNuloException;
import Models.AparatosDeGimnasio;
import Models.CentroEntrenamiento;
import Models.EquiposDeEntrenamientoAlAireLibre;
import Models.InstrumentosParaDeportesDeEquipo;

public class CollanteParcialUnoProgramacionII {

    public static void main(String[] args) {
        
        //-------------------------INSTANCIAR OBJETOS Y CARGA----------------
        CentroEntrenamiento centro = new CentroEntrenamiento();

        try {
            centro.agregarEquipo(new InstrumentosParaDeportesDeEquipo("Disco Bumper 20 kg", "Box de crossfit", NivelUso.ALTA, "crossfit"));
            centro.agregarEquipo(new InstrumentosParaDeportesDeEquipo("Barra olimpica", "Box de crossfit", NivelUso.ALTA, "crossfit"));
            centro.agregarEquipo(new EquiposDeEntrenamientoAlAireLibre("mancuernas", "exterior", NivelUso.MEDIA, 9));
            centro.agregarEquipo(new EquiposDeEntrenamientoAlAireLibre("paralelas", "exterior", NivelUso.BAJA, 2));
            centro.agregarEquipo(new AparatosDeGimnasio("banco reclinable", "sala de musculacion", NivelUso.ALTA, 300));
            centro.agregarEquipo(new AparatosDeGimnasio("smith", "sala de musculacion", NivelUso.ALTA, 400));
            centro.agregarEquipo(new EquiposDeEntrenamientoAlAireLibre("pesa rusa", "sala de musculacion", NivelUso.ALTA, 13)); //mayor resistencia de la establecida

            System.out.println("-----------------------------Equipo repetido-----------------------------");

            centro.agregarEquipo(new AparatosDeGimnasio("Rack de sentadilla", "sala de musculacion", NivelUso.ALTA, 500));
            centro.agregarEquipo(new AparatosDeGimnasio("Rack de sentadilla", "sala de musculacion", NivelUso.MEDIA, 500));
            
            centro.agregarEquipo(null);//equipo nulo para la personalizada

        } catch (EquipoDuplicadoException | EquipoNuloException e) {
            System.out.println(e.getMessage());
            
        } catch (RuntimeException r) {
            System.out.println("Ocurrio un error inesperado:" + r.getMessage());
        }
        
        //----------------------------------------LISTAR EQUIPOS----------------------------
        System.out.println("-------------------------LISTA DE EQUIPOS-------------------------------");
        
        centro.mostrarEquipos();
        
        //----------------------------PREPARAR EQUIPOS------------------------------------------
        
        centro.prepararEquipos();
        
        //----------------------------FILTRADO---------------------------------
        System.out.println("-----------------------Filtrado de nivel de uso----------------------------");

        System.out.println("----------Nivel BAJA--------------");
        centro.filtrarPorNivelUso(BAJA);

        System.out.println("----------Nivel MEDIA--------------");
        centro.filtrarPorNivelUso(MEDIA);

        System.out.println("----------Nivel ALTA--------------");
        centro.filtrarPorNivelUso(ALTA);
    }
}
