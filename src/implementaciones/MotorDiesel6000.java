package implementaciones;

import interfaces.Motor;

public class MotorDiesel6000 implements Motor {

    @Override
    public void tipo() {
        System.out.println("Motor Diesel 6000cc");
    }
}
