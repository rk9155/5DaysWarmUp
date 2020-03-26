#include <iostream>
using namespace std;

int power(int a,int b){
	if(b==0){
		return 1;
	}
	//recursive function

	int smallans = power(a,b/2);
	smallans *= smallans;
	if (b&1)
	 {
	 	smallans *= a;
	 } 
	 return smallans;
}

int main()
{
	int a,b;
	cin>>a>>b;
    int ans = power(a,b);
    cout<<ans<<endl;

	return 0;
}