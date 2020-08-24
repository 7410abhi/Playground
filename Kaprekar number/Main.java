#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int len,num, len1, len2, n1, n2, sum;
    cin >> num;
    int square = pow(num,2);
    len = log10(square) + 1;
    len1= len/2;
    len2 = len-len1;
    n1=square/pow(10,len2);
    n2 = square%int(pow(10,len2));
    sum = n1+n2;
    if (sum==num)
      cout<<"Kaprekar Number";
    else
      cout<<"Not a Kaprekar Number";
}