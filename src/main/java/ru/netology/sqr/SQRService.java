package ru.netology.sqr;

public class SQRService {
    public int squareCalculate(int lowerBound, int upperBound) {
        int counter = 0;
        int square;
        for (int i = 10; i < 100; i++) {
            square = i * i;
            if ((square >= lowerBound) && (square <= upperBound)) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
