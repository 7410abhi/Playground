#include<iostream>
using namespace std;
int main()
{
  int d1, c1, d2, c2, sum_c, sum_d, r;
  cin>>d1>>c1>>d2>>c2;
  sum_c = c1+c2;
  if (sum_c>100)
    r=sum_c/100;
    sum_c = sum_c%100;
  sum_d = d1+d2+r;
  cout<<sum_d<<"\n"<<sum_c;
  
}