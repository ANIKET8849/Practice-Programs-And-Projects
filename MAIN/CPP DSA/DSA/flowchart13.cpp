#include<iostream>
using namespace std;

int main(){
	int s1,s2,s3;
	cout<<" Enter The Marks Of First Subject : "<<endl;
	cin>>s1;
	cout<<" Enter The Marks Of Second Subject : "<<endl;
	cin>>s2;
	cout<<" Enter The Marks Of Third Subject : "<<endl;
	cin>>s3;
	int t=s1+s2+s3;
	float p=t/3;
	cout<<" The Total Marks Is  : "<<t<<endl;
	cout<<" The Total Percentage Is : "<<p<<endl;
	if(p>=35){
		cout<<" You Are Pass  : "<<endl;
	}
	else{
		cout<<" You Are Fail  : "<<endl;
	}
}