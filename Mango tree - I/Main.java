#include<iostream>
using namespace std;
int main()
{
  int rows, columns, n;
  cin>>rows>>columns>>n;
  if (((n>0) && (n<=rows)) || ((n>(rows*columns-rows)) && (n<=rows*columns)) || (n%rows==1))
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}