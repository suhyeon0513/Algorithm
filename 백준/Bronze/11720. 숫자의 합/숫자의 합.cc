#include<iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;

    char c;

    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> c;
        sum += c - 48;  // '0' = 48을 빼서 int 타입으로 변환
    }

    cout << sum << endl;

    return 0;
}
