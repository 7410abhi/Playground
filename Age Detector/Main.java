#include<iostream>
using namespace std;
int main()
{
  int b_year, c_year, age;
  cin>>b_year>>c_year;
  if (c_year<b_year)
    c_year = 100+c_year;
  age = (c_year-b_year);
  cout<<age;
  return 0;
}