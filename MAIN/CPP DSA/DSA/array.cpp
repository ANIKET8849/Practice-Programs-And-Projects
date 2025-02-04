#include<iostream>
using namespace std;

int main(){
	int arr[10],i,n,flag=0;
	for(i=0; i<5; i++){
		cout<<"\nEnter The Numbers :";
		cin>>arr[i];
	}
	for(i=0; i<5; i++){
		cout<<arr[i]<<"\t";
	}
	cout<<"\n\nEnter The Number To Search : ";
	cin>>n;
	for(i=0; i<5; i++){
		if(n==arr[i]){
			flag=1;
			break;
		}
	}
	if(flag==1){
			cout<<"The Found Number Is At Position : "<<i;
		}else{
			cout<<"The Number Not Found ";
		}
}