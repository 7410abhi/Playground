#include <iostream>
using namespace std;

bool isPerfect(int no)
{
	int i = 0;
	int sum = 0;

	while (i++ < no)
	{
		if (no % i == 0 && i < no)
		{
			sum += i;
		}
	}
	return sum == no;
}

int main()
{
	int first, second;
	cin >> first >> second;
	for (int i = first; i <= second; i++)
	{
		if (isPerfect(i))
		{
			cout << i << " ";
		}
	}

	return 0;
}