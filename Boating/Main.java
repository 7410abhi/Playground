#include<iostream>
using namespace std;
int main()
{
  int w, a, c;
  cin>>w>>a>>c;
  a = a*75;
  c = c*30;
  if ((a+c)<=w)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}