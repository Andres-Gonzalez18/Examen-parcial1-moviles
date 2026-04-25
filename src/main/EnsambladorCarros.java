package main;

import implementaciones.MotorDiesel5000;
import implementaciones.MotorDiesel6000;
import implementaciones.MotorGasolina5000;
import implementaciones.MotorGasolina6000;
import implementaciones.Relacion47;
import implementaciones.Relacion49;
import implementaciones.SuspensionARB25;
import implementaciones.SuspensionTJM35;
import interfaces.Motor;
import interfaces.RelacionesDiferenciales;
import interfaces.Suspension;
import java.util.ArrayList;
import java.util.List;
import modelos.Carro;
import modelos.CarroDiesel;
import modelos.CarroGasolina;


public class EnsambladorCarros {

    public static void main(String[] args) {


        // Motores Gasolina
        Motor[] motoresGasolina = {
            new MotorGasolina5000(),   // Inyección de dependencias: creados aquí
            new MotorGasolina6000()
        };

        // Motores Diesel 
        Motor[] motoresDiesel = {
            new MotorDiesel5000(),
            new MotorDiesel6000()
        };

        // Relaciones diferenciales disponibles
        RelacionesDiferenciales[] relaciones = {
            new Relacion47(),
            new Relacion49()
        };

        // Suspensiones disponibles
        Suspension[] suspensiones = {
            new SuspensionARB25(),
            new SuspensionTJM35()
        };


        // 2. Lista polimórfica: tipo base Carro almacena subclases
      
        List<Carro> todosLosCarros = new ArrayList<>();

        // 3. Generar todas las combinaciones de carros GASOLINA
        System.out.println("=== Ensamblando Carros de Gasolina ===\n");

        for (Motor motor : motoresGasolina) {
            for (RelacionesDiferenciales relacion : relaciones) {
                for (Suspension suspension : suspensiones) {

                    Carro carro = new CarroGasolina(motor, relacion, suspension);

                    todosLosCarros.add(carro);
                }
            }
        }


        // 4. Generar todas las combinaciones de carros DIESEL

        System.out.println("\n=== Ensamblando Carros de Diesel ===\n");

        for (Motor motor : motoresDiesel) {
            for (RelacionesDiferenciales relacion : relaciones) {
                for (Suspension suspension : suspensiones) {

                    Carro carro = new CarroDiesel(motor, relacion, suspension);

                    todosLosCarros.add(carro);
                }
            }
        }

        
        // 5. Mostrar configuración completa de cada carro ensamblado
     
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║      CATÁLOGO COMPLETO DE CARROS 4x4 AUTOCROSS           ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.println("  Total de combinaciones generadas: " + todosLosCarros.size());
        System.out.println();

        int numeroCombinacion = 1;

        for (Carro carro : todosLosCarros) {
            System.out.println("──────────────────────────────────────────────────────────");
            System.out.println("  Combinación #" + numeroCombinacion++);

            // POLIMORFISMO + SOBRESCRITURA:
            // Se llama al método sobre tipo base Carro, pero Java ejecuta
            // la implementación real de la subclase concreta
            carro.tipoCarroOffRoad();

            System.out.println();
        }

        System.out.println("══════════════════════════════════════════════════════════");
        System.out.println("  Ensamblaje completado. Total: " + todosLosCarros.size() + " carros configurados.");
        System.out.println("══════════════════════════════════════════════════════════");
    }
}
