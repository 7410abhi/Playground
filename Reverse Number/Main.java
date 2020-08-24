#include <iostream>
#include <cstring>
using namespace std;
int main() 
{
  int n;
  cin>>n;
  string s=to_string(n);
  int len = s.length()-1;
  while(len>=0)
  {
    cout<<s[len];
    len -= 1;
  }
  return 0;
}