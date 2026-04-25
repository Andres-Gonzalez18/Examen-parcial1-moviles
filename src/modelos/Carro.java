package modelos;

import interfaces.Motor;
import interfaces.RelacionesDiferenciales;
import interfaces.Suspension;


public abstract class Carro {


    protected Motor motor;
    protected RelacionesDiferenciales relacionDiferencial;
    protected Suspension suspension;

    /**
     * @param motor               Motor a montar en el carro.
     * @param relacionDiferencial Relación diferencial del carro.
     * @param suspension          Sistema de suspensión del carro.
     */
    public Carro(Motor motor,
                 RelacionesDiferenciales relacionDiferencial,
                 Suspension suspension) {
        this.motor = motor;
        this.relacionDiferencial = relacionDiferencial;
        this.suspension = suspension;
    }

    /**
     * Método abstracto que cada subclase debe implementar.
     */
    public abstract void tipoCarroOffRoad();
}
