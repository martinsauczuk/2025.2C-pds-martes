package solid.DIP.carrerasConMascotas.refactor.participantes;

import solid.DIP.carrerasConMascotas.refactor.participantes.acompaniantes.Acompaniante;

public class CorredorConAcompaniante implements Participante{

    private final Acompaniante acompaniante;
    private final String nombre;

    public CorredorConAcompaniante(String nombre, Acompaniante perro) {
        this.nombre = nombre;
        this.acompaniante = perro;
    }

    public Acompaniante tuAcompaniantes() {
        return acompaniante;
    }

    @Override
    public String tuDescripcion() {
        return new StringBuilder()
                .append("Soy un CorredorConAcompaniante")
                .append(" y me acompania")
                .append(acompaniante.tuNombre())
                .toString();

    }
}
