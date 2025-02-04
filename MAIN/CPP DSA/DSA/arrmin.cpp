#include <iostream>
using namespace std;

int main (){
	int a[10], i,s;
	int min,max;
		for(i=0; i<10; i++){
			cout<<"Enter The Number : ";
			cin>>a[i];
		}
		s=a[0];
		for(i=1; i<10; i++){
			s=s+a[i];
		}
		cout<<"\n\nSum Is : "<<s;
		min=max=a[0];
		for(i=0; i<10; i++){
			if(a[i]<min){
				min=a[i];	
			}
			if(a[i]>max){
				max=a[i];
			}
			
		}
		cout<<"\nThe Minimum Is : "<<min;
		cout<<"\nThe Maximum Is : "<<max;
		return 0;
}
