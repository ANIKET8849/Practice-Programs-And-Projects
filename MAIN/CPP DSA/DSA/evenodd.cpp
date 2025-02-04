#include <iostream>
using namespace std;

int main (){
	int a[10], i,c=0;
		for(i=0; i<10; i++){
			cout<<"Enter The Number : ";
			cin>>a[i];
		}
		for(i=0; i<10; i++){
			if(a[i]%2==0){
				c++;
			}
		}
	cout<<" \nEven : "<<c;
	cout<<"\nodd : "<<(10-c);
	return 0;
}
