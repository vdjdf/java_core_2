package homework2;

public class HomeWorkAdvanced {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("Задание №1:");
        double increment = 0.01123;
        double result = 0;
        int iterations = 0;
        while (true) {
            if (increment < 0) {
                break;
            }
            iterations++;
            result += increment;
            if (result > 1_000_000) {
                System.out.println(iterations);
                break;
            }
        }
        //Задание №2
        System.out.println("Задание №2:");
        int[] Array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < Array.length; i++) {
            if (i % 2 == 0) {
                Array[i] = 0;
            }
            System.out.print(Array[i]);
        }

        //Задание №3
        System.out.println("\nЗадание №3:");
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;

        boolean sale20 = (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem));

        int chekFuel = 0;                 // Цена бензина
        int ckekMotor = 0;                // Цена мотора
        int chekElectr = 0;               // Цена электрики
        int chekTransmission = 0;         // Цена коробки
        int chekWheels = 0;               // Цена колес
        double endChek = 0;               // общий чек

        int allProblem = 0;               // суммарно проблемы ( кроме бензы)
        if (!hasFuel) {
            chekFuel = 1000;
        }
        if (hasMotorProblem) {
            allProblem++;
            ckekMotor = 10000;
        }
        if (hasElectricsProblem) {
            allProblem++;
            chekElectr = 5000;
        }
        if (hasTransmissionProblem) {
            allProblem++;
            chekTransmission = 4000;
        }
        if (hasWheelsProblem) {
            allProblem++;
            chekWheels = 2000;
        }

        if (!hasFuel && allProblem > 0) {
            endChek = 0;
        } else if (sale20) {
            endChek = (chekFuel + ckekMotor + chekElectr + chekTransmission + chekWheels) * 0.8;
        } else if (allProblem >= 2) {

            endChek = (chekFuel + ckekMotor + chekElectr + chekTransmission + chekWheels) * 0.9;
        } else {
            endChek = chekFuel + ckekMotor + chekElectr + chekTransmission + chekWheels;
        }


        if (allProblem > 0 && hasFuel) {
            System.out.println("Чек: " + endChek);
        } else {
            System.out.println("Такой ситуации быть не может :р");
        }



    }
}


