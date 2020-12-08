#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int n;
	cin >> n;
	char a[n+2][n+2];
	for(int i=1; i<=n; ++i)
		for(int j=1; j<=n; ++j)
			cin >> a[i][j];
	int cnt=0;
	for(int i=1; i<=n; ++i)
		for(int j=1; j<=n; ++j)
			if(a[i][j]=='X'&&a[i-1][j-1]=='X'&&a[i-1][j+1]=='X'&&a[i+1][j-1]=='X'&&a[i+1][j+1]=='X')
				cnt++;
	cout << cnt << "\n";
}
