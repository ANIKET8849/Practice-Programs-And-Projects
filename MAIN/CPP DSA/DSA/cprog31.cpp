#include<iostream>
using namespace std;

int main(){
	int n,n1,d,s=0;
	cout<<"Enter Any Number :  ";
	cin>>n;
	n1=n;
	while(n1!=0){
		d=n1%10;
		s=(s*10)+d;
		n1=n1/10;
	}
	if(n==s){
		cout<<"The String Is Palindrome";
	}
	else{
		cout<<"The String Is Not Palindrome";
	}
}