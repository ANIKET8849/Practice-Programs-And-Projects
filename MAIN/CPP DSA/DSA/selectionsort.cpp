#include<iostream>
using namespace std;

int main(){
	int i,j,n,a[5];
	for(i=0; i<5; i++){
		cout<<"Enter The Number : ";
		cin>>a[i];
	}
	for(i=0; i<5; i++){
		for(j=i+1; j<5; j++){
			if(a[i]>a[j]){
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			}
		}
	}
	for(i=0; i<5; i++){
		cout<<"\n"<<a[i];
	}
}