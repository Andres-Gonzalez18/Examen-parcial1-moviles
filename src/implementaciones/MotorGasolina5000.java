package implementaciones;

import interfaces.Motor;


public class MotorGasolina5000 implements Motor {

 
    @Override
    public void tipo() {
        System.out.println("Motor Gasolina 5000cc");
    }
}
