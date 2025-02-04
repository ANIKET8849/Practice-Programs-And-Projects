#include<iostream>
using namespace std;

int main(){
int r,c;
r=1;
	while(r<=5){
		c=1;
		while(c<=(6-r)){
			cout<<"   ";
			c++;
		}
		c=1;
		while(c<=r){
			cout<<" *   ";
			c++;
			}
	cout<<" \n ";
	r++;
	}
return 0;
}