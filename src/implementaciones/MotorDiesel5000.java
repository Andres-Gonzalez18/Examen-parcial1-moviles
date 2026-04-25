package implementaciones;

import interfaces.Motor;


public class MotorDiesel5000 implements Motor {

   
    @Override
    public void tipo() {
        System.out.println("Motor Diesel 5000cc");
    }
}
