#include<iostream>
using namespace std;
int main()
{
  int f, s, o;
  cin>>f>>s>>o;
  cout<<"Enter first number : Enter second number : Menu\n"<<"1.Addition\n"<<"2.Subtraction\n"<<"3.Multiplication\n"<<"4.Division\n"<<"5.Remainder\n";
  switch(o){
    case 1:
      cout<<f+s;
      break;
    case 2:
      cout<<f-s;
      break;
    case 3:
      cout<<f*s;
      break;
    case 4:
      cout<<f/s;
      break;
    case 5:
      cout<<f%s;
      break;
    default:
      cout<<"Invalid operation";
      break;
  }
}