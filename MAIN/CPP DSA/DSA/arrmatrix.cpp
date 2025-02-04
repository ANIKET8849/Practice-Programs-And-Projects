#include<iostream>
using namespace std;

int main(){
	int a[10][10],i,j;
	for(i=0; i<3; i++){
		for(j=0; j<3; j++){
			cout<<"Enter The Number "<<"for row="<<i<<" col ="<<j<<" :";
			cin>>a[i][j];
		}
	}
	for(i=0; i<3; i++){
		for(j=0; j<3; j++){
			cout<<a[i][j]<<"\t";
			
		}
		cout<<"\n";
	}

}
