#include<iostream>
using namespace std;

int main(){
	int n;
	cout<<"Enter Number Of Rows You Want To Enter : ";
	cin>>n;
	for(int r=1; r<=n; r++){
		int c=1;
		while(c<=((n+1)-r)){
			cout<<c;
			c++;
		}
		c=1;
		while(c<=((2*r)-2)){
			cout<<" ";
			c++;
		}
		
		for(c=((n+1)-r); c>=1; c--){
			cout<<c;
		}
		
	cout<<"\n";
	}
	for(int r=1; r<=n; r++){
		int c=1;
		while(c<=r){
			cout<<c;
			c++;
		}
		c=1;
		while(c<=((((n+1)-r)*2)-2)){
			cout<<" ";
			c++;
		}
		for(c=r; c>=1; c--){
			cout<<c;
		}
		
	cout<<"\n";
	}
}