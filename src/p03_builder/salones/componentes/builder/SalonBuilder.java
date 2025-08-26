package p03_builder.salones.componentes.builder;

import p03_builder.salones.Salon;
import p03_builder.salones.componentes.Catering;
import p03_builder.salones.componentes.Escenario;
import p03_builder.salones.componentes.Estacionamiento;
import p03_builder.salones.componentes.Musicalizacion;
import p03_builder.salones.componentes.mobiliarios.Mobiliario;
import p03_builder.salones.componentes.sistemasDeAcceso.SistemaDeAcceso;

public class SalonBuilder {

    private final String id;
    private Musicalizacion musicalizacion;
    private Catering catering;
    private Mobiliario mobiliario;
    private Escenario escenario;
    private SistemaDeAcceso sistemaDeAcceso;

    private Estacionamiento estacionamiento;

    public SalonBuilder(String id) {
        this.id = id;
    }


    public SalonBuilder catering(Catering catering) {
        this.catering = catering;
        return this;
    }

    public SalonBuilder mobiliario(Mobiliario mobiliario) {
        this.mobiliario = mobiliario;
        return this;
    }

    public SalonBuilder escenario(Escenario escenario) {
        this.escenario = escenario;
        return this;
    }

    public SalonBuilder sistemaDeAcceso(SistemaDeAcceso sistemaDeAcceso) {
        this.sistemaDeAcceso = sistemaDeAcceso;
        return this;
    }


    public Salon build() {
        return new Salon(this.id,
                this.musicalizacion,
                this.catering,
                this.mobiliario,
                this.escenario,
                this.sistemaDeAcceso,
                this.estacionamiento
        );
    }



}
