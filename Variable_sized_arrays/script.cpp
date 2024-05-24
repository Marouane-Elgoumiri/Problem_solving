/*
Output Format

For each pair of  and  values (i.e., for each query), print a single integer that denotes the element located at index  of the array referenced by . There should be a total of  lines of output.

Sample Input

2 2
3 1 5 4
5 1 2 8 9 3
0 1
1 3
Sample Output

5
9
*/

#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int n, q;
    cin >> n >> q;

    vector<vector<int>> arrays(n);

    for (int i = 0; i < n; ++i)
    {
        int k;
        cin >> k;
        arrays[i].resize(k);
        for (int j = 0; j < k; ++j)
        {
            cin >> arrays[i][j];
        }
    }

    for (int i = 0; i < q; ++i)
    {
        int a, b;
        cin >> a >> b;
        cout << arrays[a][b] << endl;
    }

    return 0;
}
