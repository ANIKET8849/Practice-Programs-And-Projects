#include<iostream>
using namespace std;

int main(){
	int r,c;
	for(r=1; r<=5; r++){
		for(c=r+6; c>=(r*2)+1; c--){
			cout<<c<<"  ";
		}
	cout<<" \n ";
	}
}