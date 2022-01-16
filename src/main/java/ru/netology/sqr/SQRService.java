package ru.netology.sqr;

public class SQRService {
    public int calculateSquare(int aEdge, int bEdge) {
        int minLimit = bEdge > aEdge ? aEdge : bEdge;
        int maxLimit = bEdge > aEdge ? bEdge : aEdge;
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (((i * i) > minLimit) & ((i * i) < maxLimit)) {
                count++;
            }
        }
        return count;
    }
}
