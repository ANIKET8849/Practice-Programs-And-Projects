#include<iostream>
using namespace std;

int main(){
	for(int r=1; r<=10; r++){
			int c=1;
		if(r<=5){
		
		while(c<=(6-r)){
			cout<<c;
			c++;
		}
		c=1;
		while(c<=((2*r)-1)){
			cout<<" ";
			c++;
		}
		 c=1;
		while(c<=(6-r)){
			cout<<c;
			c++;
		}
		}		
		if(r>5 && r<10){
		c=5;
		while(c<=r){
			cout<<c;
			c++;
		}
		c=5;
		while(c<=(((11-r)*2))+1){
			cout<<" ";
			c++;
		}
		 c=5;
		while(c<=r){
			cout<<c;
			c++;
		}
		}		
	cout<<"\n";
}
}