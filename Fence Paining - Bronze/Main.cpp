#include <iostream>
using namespace std;

int main() {
    freopen("Main.in", "r", stdin);
    freopen("Main.out", "w", stdout);

    int a;
    int b;
    int c;
    int d;
    cin >> a >> b >> c >> d;
    
    int total = (b - a) + (d - c);

    int subtraction = max(min(b, d) - max(a, c), 0);
    cout << total - subtraction;
}