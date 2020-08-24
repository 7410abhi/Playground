# include<iostream>
using namespace std;
int main()
{
  int n1, n2, total, sum;
  cin>>n1>>n2;
  total = n1+n2;
  sum = 0;
  for (int i=1; i<=total; i++)
  {
    sum = sum + i;
    if (sum==total){
      cout<<"They can read the message";
      break;}
    else if (sum>total)
    {
      cout<<"They can't read the message";
      break;
    }
  }
}