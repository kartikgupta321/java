#include <iostream>
using namespace std;
int main() {
	long long a,b,c,t,n;
	cin>>t;
    for (long long i = 0; i < t; i++){
        cin>>n;
        if (n%2!=0){
            a=n/2;
            b=n/2;
            c=1;
        }
        else {
            if (n%4!=0){
                a=(n/2)-1;
                b=(n/2)-1;
                c=2;
            }
            else{
                a=n/2;
                b=n/4;
                c=n/4;
            }
        }
        cout << a << " " << b << " " << c << '\n';
    }
	return 0;
}
