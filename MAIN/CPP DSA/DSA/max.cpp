#include<iostream>
using namespace std;

int main(){
int max,n;
cout<<"Enter The Number  :   ";
cin>>n;
max=n;
for(int i=0; i<10; i++){
cout<<"Enter The Number  :   ";
cin>>n;
if(n>max){
max=n;
}
}
cout<<"Minimum Is : "<<max;
return 0;
}