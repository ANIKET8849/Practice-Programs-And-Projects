#include<iostream>
using namespace std;

int main(){
	int n,c=2,r,cnt=0;
	cout<<"Enter Any Number : ";
	cin>>n;
	cout<<endl<<" Divisible By : "<<endl;
	while(c<=n){
	r=n%c;
		if(r==0){
			cout<<c<<endl;
			cnt++;
		}
	
	c++;
	}
	if(cnt>1){
		cout<<endl<<" The Number Is Not Prime  ";
	}
	else{
		cout<<endl<<" The Number Is Prime : ";
	}
}