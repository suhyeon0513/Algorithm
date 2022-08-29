#include<iostream>
#include <vector>
#include<algorithm>

using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<double> v;
    double score = 0;
    double sum = 0;

    for (int i = 0; i < n; i++)
    {
        cin >> score;
        v.push_back(score);
    }

    sort(v.begin(), v.end());

    for (int i = 0; i < n; i++)
    {
        v[i] = v[i] / v[n - 1] * 100;
        sum += v[i];
    }

    cout << sum / n << endl;

    return 0;

}


