#include<iostream>
using namespace std;
int main()
{
  int f1, f2, f3, s1, s2, s3, a1, a2, a3;
  cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  float f, s, a;
  f = f1-(0.01*f2*f1)+f3;
  s = s1-(0.01*s2*s1)+s3;
  a = a1-(0.01*a2*a1)+a3;
  cout<<"In Flipkart Rs."<<f<<endl;
  cout<<"In Snapdeal Rs."<<s<<endl;
  cout<<"In Amazon Rs."<<a<<endl;
  if ((f<=s) && (f<=a))
    cout<<"He will prefer Flipkart";
  else if ((s<f) && (s<a))
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}