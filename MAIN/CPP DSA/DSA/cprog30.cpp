#include<iostream>
using namespace std;

int main(){
 int n,cnt=0;
cout<<"Enter Number : ";
cin>>n;
for(int i=1; i<=n; 	i++){
		if(n%i==0){
			cout<<"Divisible By : "<<i<<"\n";
			cnt++;
		}
	}
	cout<<"\n\nTotal Divible By :"<<cnt;
	if(cnt==2){
		cout<<"\n\nThe Number Is Prime ";
	}
	else{
		cout<<"\n\nThe Number Is Not Prime ";
	}
}