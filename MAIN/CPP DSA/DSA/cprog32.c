#include<iostream>
using namespace std;

int main(){
	int a[10],i,j,n,low,high,mid;
	for(i=0; i<10; i++){
		cout<<"\nEnter The Elements : ";
		cin>>a[i];
	}
	cout<<"\n\n Enter The Key : ";
	cin>>n;
	
	for(i=0; i<10; i++){
		for(j=i+1; j<10; j++){
			if(a[i]>a[j]){
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			}
		}
	}

	low=0;
	for(i=0; a[i]!='\0'; i++){
		
	}
	high=i-1;
	while(low>high){
		mid=(low+high)/2;
		if(mid==n){
			cout<<"key Is Found ";
		}else if(high>=mid && low<=mid){
			if(mid<n){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}else{
			cout<<"Key Is not Found ";
		}	
	}
}