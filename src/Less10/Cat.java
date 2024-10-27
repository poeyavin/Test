package Less10;

//Создаём класс Кот
class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++; //Счетчик котов
        this.isFull = false;
    }

    //Переопределяем метод для бега кота
    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    //Переопределяем метод для плавания кота
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }


    //Создаём метод мисок с едой
    public void eat(Bowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            isFull = true;
            System.out.println(name + " поел.");
        } else {
            System.out.println(name + " не может поесть, недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}
