#include<iostream>
using namespace std;

int main(){
	int i,j;
	char a[20];
	printf("Enter The String : ");
	gets(a);
	for(i=0; a[i]!= '\0'; i++){
		
	}
	bool flag=true;
	for(j=0,i=i-1; j<=i; i--,j++){
		if(a[j]!=a[i]){
           		flag=false;
		}
          }      
         if(flag==true){
		printf("The String Is Palindrome");
	}
	else{
		printf("The String Is Not Palindrome");
	}
}