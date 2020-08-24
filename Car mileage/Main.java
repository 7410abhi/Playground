#include<iostream>
using namespace std;
int main()
{
  float mileage; int lt, d;
  cin>>mileage>>lt>>d;
  if (mileage*lt>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach"; 
}