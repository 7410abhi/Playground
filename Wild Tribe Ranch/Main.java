#include<iostream>
using namespace std;
int main()
{
  int max, w;
  cin>>max>>w;
  if (w<max)
  {
    cout<<"Yes, you can enter.";
  }
  else if (w>max)
  {
    cout<<"Sorry, you can't enter";
  }
  else
  {
    cout<<"Yes, you can enter. Kindly use a rope.";
  }
}