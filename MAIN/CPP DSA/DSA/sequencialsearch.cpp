#include<iostream>
using namespace std;

int main(){
	int i,n,a[10];
	for(i=0; i<10; i++){
		cout<<"\nEnter The Number :";
		cin>>a[i];
	}
	cout<<"Enter Number To Search : ";
	cin>>n;
	bool flag=false;
	for(i=0; i<10; i++){
		if(n==a[i]){
			flag=true;
			break;
		}else{
			flag=false;
		}
	}
	if(flag==true){
		cout<<"The Element Found  At Location : "<<i+1<<endl;
	}else{
		cout<<"The Element Is Not Found"<<endl;
	}
}
