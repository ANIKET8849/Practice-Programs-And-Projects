#include<iostream>
using namespace std;

int main(){
	int a[10],b[10],c[50],i,n=0;

	for(i=0; i<10; i++){
		cout<<"Enter A Number You Want To Add In First Array : ";
		cin>>a[i];
	}

	for(i=0; i<10; i++){
		cout<<"Enter A Element You Want To Add In Second Array : ";
		cin>>b[i];
	}
	
	
		
			for(i=0; i<10; i++){
				c[i]=a[i];
			}
		
			
			for(i=10,n=0; i<20; i++,n++){
				c[i]=b[n];
			}
	
	for(i=0; i<20; i++){
		cout<<"The Element Is : "<<"  "<<c[i]<<endl;
	}
}