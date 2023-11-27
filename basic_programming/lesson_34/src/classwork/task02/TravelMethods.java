package classwork.task02;

public enum TravelMethods {
    ON_FOOT(1), // 5 км/ч
    BUS(8), // 40 км/ч
    CAR(12), // 60 км/ч
    TRAIN(24); // 120 км/ч

    // насколько быстрее этот метод передвижения по сравнению с ходьбой
    final int speedCoefficient;

    TravelMethods(int speedCoefficient) {
        this.speedCoefficient = speedCoefficient;
    }
}
