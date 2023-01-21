#include <iostream>
using namespace std;

int main() {
    freopen("Main.in", "r", stdin);
    freopen("Main.out", "w", stdout);

    int length;
    int width;
    int scaling;
    cin >> length >> width >> scaling;

    string character;
    for (int i = 0; i < length; i++) {
        for (int i2 = 0; i2 < width; i2++) {
            cin >> character;
            for (int i3 = 0; i3 < scaling; i3++) {
                cout << character[i2];
            } 
            cout << "\n";
        }
        
    }
    
}