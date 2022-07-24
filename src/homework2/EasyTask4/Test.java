package homework2.EasyTask4;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog(10, "Красный");
        System.out.println(dog.getYear() + " " + dog.getColor());
        dog.setColor("Зеленый");
        dog.setYear(5);
        System.out.println(dog.getYear() + " " + dog.getColor());

        Cat cat = new Cat(3, "Боря");
        System.out.println("Вес кота: " + cat.getKg() + " Имя кота: " + cat.getName());
    }

}
