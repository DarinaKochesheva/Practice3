package part5.part5_1;

public abstract class Predator extends Animal {
    protected Predator(String name, int age, double weight, int energyLevel) {
        super(name, age, weight, energyLevel);
    }

    public void hunt() {
        // TODO: +30 к energyLevel (макс 100), weight -= 0.5.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        energyLevel += 30;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
        weight -= 0.5;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }
}
