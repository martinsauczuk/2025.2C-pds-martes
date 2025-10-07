package solid.DIP.carrerasConMascotas.refactor;

import solid.DIP.carrerasConMascotas.refactor.participantes.Participante;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


/**
 *
 */
public class Evento {

    private HashSet<Participante> participantes = new HashSet<>();

    public void incribir(Participante participante) {
        this.participantes.add(participante);
    }

    public Set<String> nombresDeTodosLosParticipantes() {
        return this.participantes.stream()
                .map(participante -> participante.tuDescripcion())
                .collect(Collectors.toSet());
    }

}
