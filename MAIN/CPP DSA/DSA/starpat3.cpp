#include<iostream>
using namespace std;

int main(){
	int r,c,n;
	for(r=1; r<=5; r++){
		
		for(c=1; c<=(6-r); c++){
			n=1;
			if(n==c){
				cout<<"  "<<n;
			}
			n++;
		}
		
		cout<<"\n";
	}
	
	return 0;
}