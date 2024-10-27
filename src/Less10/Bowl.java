package Less10;

//Создаём класс Миска
class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        }
    }
    //Метод для добавления еды в миску
    public void addFood(int amount) {
        foodAmount += amount;
    }
}

