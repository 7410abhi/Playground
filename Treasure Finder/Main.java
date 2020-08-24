#include<iostream>
using namespace std;
int main()
{
  int b1, b2, b3;
  cin>>b1>>b2>>b3;
  if ((b1>b2) && (b1>b3))
  {
    if (b2>b3){
      cout<<"The treasure is in box which has number "<<b2<<endl;
      if ((b2%b3==0) && (b1%b3==0))
        cout<<"The code to open the box is "<<b3<<endl;
      else
        cout<<"The code to open the box is 1"<<endl;}
        
  	else{ 
      cout<<"The treasure is in box which has number "<<b3<<endl;
      if ((b3%b2==0) && (b1%b2==0))
        cout<<"The code to open the box is "<<b2<<endl;
      else
        cout<<"The code to open the box is 1"<<endl;}
      
  }
  else if ((b2>b1) && (b2>b3))
  {
    if (b1>b3){
      cout<<"The treasure is in box which has number "<<b1<<endl;
      if ((b2%b3==0) && (b1%b3==0))
        cout<<"The code to open the box is "<<b3<<endl;
      else
        cout<<"The code to open the box is 1"<<endl;}
  	else{ 
      cout<<"The treasure is in box which has number "<<b3<<endl;
      if ((b2%b1==0) && (b3%b1==0))
        cout<<"The code to open the box is "<<b1<<endl;
      else
        cout<<"The code to open the box is 1"<<endl;}
  } 
  else
  {
    if (b1>b2){
      cout<<"The treasure is in box which has number "<<b1<<endl;
      if ((b1%b2==0) && (b3%b2==0))
        cout<<"The code to open the box is "<<b2<<endl;
      else
        cout<<"The code to open the box is 1"<<endl;}
  	else{ 
      cout<<"The treasure is in box which has number "<<b2<<endl;
      if ((b2%b1==0) && (b3%b1==0))
        cout<<"The code to open the box is "<<b1<<endl;
      else
        cout<<"The code to open the box is 1"<<endl;}
      
  }
}