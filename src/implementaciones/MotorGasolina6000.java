package implementaciones;

import interfaces.Motor;


public class MotorGasolina6000 implements Motor {

   
    @Override
    public void tipo() {
        System.out.println("Motor Gasolina 6000cc");
    }
}
