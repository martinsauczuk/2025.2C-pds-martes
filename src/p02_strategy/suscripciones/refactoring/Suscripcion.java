package p02_strategy.suscripciones.refactoring;

import p02_strategy.suscripciones.Producto;
import p02_strategy.suscripciones.refactoring.planes.PlanDeEnvio;

public class Suscripcion {

    private String username;
    private PlanDeEnvio plan;

    Suscripcion(String username, PlanDeEnvio unPlanInicial) {
        this.username = username;
        this.plan = unPlanInicial;
    }

    public int costoDeEnvioPara(Producto unProducto) {
        return plan.costoDeEnvioPara(unProducto);
    }

    public void actualizarPlan(PlanDeEnvio unNuevoPlan) {
        this.plan = unNuevoPlan;
    }

}
