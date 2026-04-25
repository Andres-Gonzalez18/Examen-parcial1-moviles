package modelos;

import interfaces.Motor;
import interfaces.RelacionesDiferenciales;
import interfaces.Suspension;

public class CarroDiesel extends Carro {

    /**
     * Constructor de CarroDiesel.
     * @param motor               Motor Diesel del carro.
     * @param relacionDiferencial Relación diferencial del carro.
     * @param suspension          Sistema de suspensión del carro.
     */
    public CarroDiesel(Motor motor,
                       RelacionesDiferenciales relacionDiferencial,
                       Suspension suspension) {
        super(motor, relacionDiferencial, suspension);
        System.out.println("Carro de Diesel");
    }

    @Override
    public void tipoCarroOffRoad() {
        System.out.println("  Tipo de carro: Carro 4x4 Diesel Off-Road");

        // Polimorfismo: cada componente ejecuta su propia versión de tipo()
        System.out.print("  Motor        : ");
        motor.tipo();                        

        System.out.print("  Diferencial  : ");
        relacionDiferencial.tipo();          

        System.out.print("  Suspensión   : ");
        suspension.tipo();                  
    }
}
