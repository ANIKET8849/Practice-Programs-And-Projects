#include <iostream>
using namespace std;

int main (){
	int a[10], i;
		for(i=0; i<10; i++){
			cout<<"Enter The Number : ";
			cin>>a[i];
		}
		for(i=9; i>=0; i--){
			cout<<"\n "<<a[i];
			
		}	
	return 0;
}
