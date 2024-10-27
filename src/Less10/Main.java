package Less10;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Тузик");
        Dog dog2 = new Dog("Шрек");

        Cat cat1 = new Cat("Тошка");
        Cat cat2 = new Cat("Лешка");

        dog1.run(150);
        dog1.swim(5);

        cat1.run(100);
        cat1.swim(1);

        System.out.println("Создано животных: " + Animal.getAnimalCount());
        System.out.println("Создано собачек: " + Dog.getDogCount());
        System.out.println("Создано котиков: " + Cat.getCatCount());

        Bowl bowl = new Bowl(50);
        Cat[] cats = {cat1, cat2};

        for (Cat cat : cats) {
            cat.eat(bowl, 20);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " покушали: " + cat.isFull());
        }

        bowl.addFood(30);
        System.out.println("Еды в миске: " + bowl.getFoodAmount());
    }
}