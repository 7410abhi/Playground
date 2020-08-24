#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
  int t_balls, r_chase, p_runs, p_balls;
  cin>>t_balls>>r_chase>>p_runs>>p_balls;
  float t_overs, c_run_rate, r_run_rate, p_overs;
  t_overs = t_balls/6;
  p_overs = (p_balls/6) + 0.1*(p_balls%6);
  c_run_rate = p_runs/p_overs;
  r_run_rate = r_chase/t_overs;
  
  cout<<t_overs<<endl;
  cout<<p_overs<<endl;
  cout<<fixed<<setprecision(1)<<c_run_rate<<endl;
  cout<<fixed<<setprecision(1)<<r_run_rate<<endl;
  if (c_run_rate >= r_run_rate)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}