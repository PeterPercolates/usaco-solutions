#include <iostream>
using namespace std;

int main() {
    freopen("Main.in", "r", stdin);
    freopen("Main.out", "w", stdout);

    int totalArea = 0;
    int billboard2[4];
    int billboard1[4];
    int truck[4];
    cin >> billboard1[0] >> billboard1[1] >> billboard1[2] >> billboard1[3];
    cin >> billboard2[0] >> billboard2[1] >> billboard2[2] >> billboard2[3];
    cin >> truck[0] >> truck[1] >> truck[2] >> truck[3];


    int width = max(min(billboard1[2], truck[2]) - max(billboard1[0], truck[0]), 0);
    int height = max(min(billboard1[3], truck[3]) - max(billboard1[1], truck[1]), 0);

    int subtractionArea = width * height;
    int area = (billboard1[2] - billboard1[0]) * (billboard1[3] - billboard1[1]);
    
    totalArea += area - subtractionArea;


    width = max(min(billboard2[2], truck[2]) - max(billboard2[0], truck[0]), 0);
    height = max(min(billboard2[3], truck[3]) - max(billboard2[1], truck[1]), 0);

    subtractionArea = width * height;
    area = (billboard2[2] - billboard2[0]) * (billboard2[3] - billboard2[1]);
    
    totalArea += area - subtractionArea;
    cout << totalArea;
}