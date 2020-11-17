#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int funzione1() {
    srand(time);
    int num = rand();
    return num;
}

float funzione2() {
    srand(time);
    int num = rand();
    return num;
}

char *funzione3() {
    return "Ciao Italia";
}

int main() {

    printf("%d", funzione1());
}
