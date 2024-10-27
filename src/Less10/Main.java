package Less10;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");

        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        dog1.run(150);
        dog1.swim(5);

        cat1.run(100);
        cat1.swim(1);

        System.out.println("Создано животных: " + Animal.getAnimalCount());
        System.out.println("Создано собак: " + Dog.getDogCount());
        System.out.println("Создано котов: " + Cat.getCatCount());
        //Создаём массив котов с едой
        Bowl bowl = new Bowl(50);
        Cat[] cats = {cat1, cat2};
        //Просим котов поесть
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        bowl.addFood(30);
        System.out.println("Еды в миске: " + bowl.getFoodAmount());
    }
}