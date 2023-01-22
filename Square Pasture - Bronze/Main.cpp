#include <iostream>
using namespace std;

int main() {
    freopen("Main.in", "r", stdin);
    freopen("Main.out", "w", stdout);
    int xValues[4];
    int yValues[4];

    cin >> xValues[0] >> yValues[0] >> xValues[1] >> yValues[1];
    cin >> xValues[2] >> yValues[2] >> xValues[3] >> yValues[3];

    int maxX = 0;
    int minX = 10000000000;

    int maxY = 0;
    int minY = 10000000000;

    for (int i = 0; i < 3; i++) {
        if (xValues[i] > maxX) {maxX = xValues[i];}
        if (xValues[i] < minX) {minX = xValues[i];}
        if (yValues[i] > maxY) {maxY = yValues[i];}
        if (yValues[i] < minY) {minY = yValues[i];}
    }
    int value =  max((maxX - minX), (maxY - minY));
    cout << value * value;
}