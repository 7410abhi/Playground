#include<iostream>
using namespace std;
int main()
{
  string s; int n;
  cin>>s>>n;
  if (s=="front"){
    if (n==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";}
  else{
    if (n==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";}
}