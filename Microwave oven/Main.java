#include<iostream>
using namespace std;
int main()
{
  int n; float t;
  cin>>n>>t;
  if (n==2)
  {  
    t = t+0.5*t;
 	cout<<t;
  }  
  else if (n == 3)
  {  
    t = t*2;
  	cout<<t;
  }  
  else
    cout<<"Number of items is more";   
}