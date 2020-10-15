#include <iostream>
#include "Convert.h"

int main(int argc, const char * argv[]) {
    int num = 0;

    std::cin >> num;
    std::cout << Convert::decToBin(num) << std::endl;
    std::cin >> num;
    std::cout << Convert::binToDec(num) << std::endl;
}