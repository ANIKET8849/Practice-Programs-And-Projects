#include<iostream>
using namespace std;

int main(){
	int r,c,i;
	for(r=1; r<=5; r++){
		for(c=1; c<=(6-r); c++){
			cout<<"   ";
		}
		for(c=r; c>=1; c--){
			cout<<c<<"  ";
		}
		for(c=2; c<(r+1); c++){
			cout<<c<<"  ";
		}
		
		cout<<" \n ";
	}
}