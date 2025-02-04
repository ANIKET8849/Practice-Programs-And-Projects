#include<iostream>
using namespace std;

int main(){
int min,n;
cout<<"Enter The Number  :   ";
cin>>n;
min=n;
for(int i=0; i<10; i++){
cout<<"Enter The Number  :   ";
cin>>n;
if(n<min){
min=n;
}
}
cout<<"Minimum Is : "<<min;
return 0;
}