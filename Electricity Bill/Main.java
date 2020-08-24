#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int unit;
  cin>>unit;
  if (unit<=200)
    cout<<"Rs."<<trunc(unit*0.5);
  else if (unit>200 && unit<=400)
    cout<<"Rs."<<trunc(unit*0.65+100);
  else if (unit>400 && unit<=600)
    cout<<"Rs."<<trunc(unit*0.8+200);
  else if (unit>800)
    cout<<"Rs."<<trunc(unit*1.25+425);   
}