#include "Convert.h"

#include <iostream>
#include <algorithm>
#include <cmath>

namespace Convert {
    int decToBin(int nd) {
        int i = 1;
        int nb = 0;

        while (nd >= 1) {
            if(nd%2 != 0){
                if (i==1) { nb+=1; }
                else { nb+=std::pow(10, i-1); }
            }
            nd/=2;
            std::cout << nd << "," << nd%2 << "," << i << std::endl;
            i++;
        }
        return nb;
    }

    int binToDec(int nd) {
        std::string str = std::to_string(nd);
        int nb = 0;

        reverse(str.begin(), str.end());
        for (int i = 0; i <= str.length(); i++) {
            if(str[i] == '1')
                nb+=std::pow(2, i);
            std::cout << nb << "," << str[i] << std::endl;
        }
        return nb;
    }
}