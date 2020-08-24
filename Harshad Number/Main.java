#include<iostream>
#include<string>
using namespace std;
int main()
{
  int n, sum=0,temp;
  cin>>n;
  temp = n;
  int l = (to_string(n)).length();
  while(n>0){
    sum = sum+n%10;
    n=n/10;}
  if (temp%sum==0){
    cout<<"Harshad Number";}
  else{
    cout<<"Not Harshad Number";}
}