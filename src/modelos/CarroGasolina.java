package modelos;

import interfaces.Motor;
import interfaces.RelacionesDiferenciales;
import interfaces.Suspension;


public class CarroGasolina extends Carro {

    /**
     * Constructor de CarroGasolina.
    
     * @param motor               Motor a gasolina del carro.
     * @param relacionDiferencial Relación diferencial del carro.
     * @param suspension          Sistema de suspensión del carro.
     */
    public CarroGasolina(Motor motor,
                         RelacionesDiferenciales relacionDiferencial,
                         Suspension suspension) {
        // Llamada al constructor de la superclase (Carro)
        super(motor, relacionDiferencial, suspension);
        System.out.println("Carro de Gasolina");
    }


    @Override
    public void tipoCarroOffRoad() {
        System.out.println("  Tipo de carro: Carro 4x4 Gasolina Off-Road");

        // Polimorfismo: cada componente ejecuta su propia versión de tipo()
        System.out.print("  Motor        : ");
        motor.tipo();                        

        System.out.print("  Diferencial  : ");
        relacionDiferencial.tipo();         

        System.out.print("  Suspensión   : ");
        suspension.tipo();                  
    }
}
