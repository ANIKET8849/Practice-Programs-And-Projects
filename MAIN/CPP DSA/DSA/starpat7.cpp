#include<iostream>
using namespace std;

int main(){
	for(int r=1; r<=5; r++){
		int c=1;
		while(c<=r){
			cout<<" ";
			c++;
		}
		c=1;
		while(c<=(6-r)){
			cout<<"*";
			c++;
		}		
	cout<<"  \n  ";
	}
}