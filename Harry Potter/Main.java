#include<iostream>
#include<string>
using namespace std;
int main()
{
  int n, first, last;
  cin>>n;
  first = n/1000; 
  last = n%10;
  cout<<first+last;
}