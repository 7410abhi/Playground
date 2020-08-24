#include<iostream>
using namespace std;
int main()
{
  int age; float time;
  cin>>age>>time;
  if (age>13)
    if (time>=12)
      cout<<"$5.00";
    else
      cout<<"$8.00";
   else
     if (time>=12)
       cout<<"$2.00";
     else
       cout<<"$4.00";
}