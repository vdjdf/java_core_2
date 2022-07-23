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
        int[] Array={1,9,5,1,1,1,1,1,1,1};
        for (int i = 0; i<Array.length; i++){
            if (i%2==0){
                Array[i]=0;
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




    }
}
