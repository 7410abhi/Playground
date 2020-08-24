#include<iostream>
#include<cstdlib>
#include<algorithm>
using namespace std;
int main()
{
  int x, y;
  cin>>x>>y;
  x = abs(x-3);
  y = abs(y-4);
  cout<<max(x,y);
  return 0;
}