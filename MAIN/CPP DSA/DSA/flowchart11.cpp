#include<iostream>
using namespace std;

int main(){
	int a;
	cout<<" Enter The Age : "<<endl;
	cin>>a;
	if(a>=18){
		cout<<" You Are Eligible For Voting ";
	}
	else{
		cout<<" You Are Not Eligible For Voting ";
	}
}