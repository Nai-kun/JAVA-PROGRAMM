#include <iostream>

int main() {
    int N;
    std:: cout << "Enter the total number of values: ";
    std:: cin >> N;

    double positiveSum = 0.0, negativeSum = 0.0;
    int positiveCount = 0, negativeCount = 0;

    for (int i = 1; i <= N; i++) {
        double num;
        std:: cout << "Enter value " << i << ": ";
        std:: cin >> num;

        if (num > 0) {
            positiveSum += num;
            positiveCount++;
        } else if (num < 0) {
            negativeSum += num;
            negativeCount++;
        }
    }

    if (positiveCount > 0) {
        double positiveAverage = positiveSum / positiveCount;
        std::cout << "Average of positive numbers: " << positiveAverage << std::endl;
    } else {
        std::cout << "No positive numbers were entered." << std:: endl;
    }

    if (negativeCount > 0) {
        double negativeAverage = negativeSum / negativeCount;
        std::cout << "Average of negative numbers: " << negativeAverage << std::endl;
    } else {
        std::cout << "No negative numbers were entered." << std::endl;
    }

    return 0;
}

