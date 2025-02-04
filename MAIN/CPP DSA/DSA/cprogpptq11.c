#include<stdio.h>
#include<conio.h>

int main(){
	int n,s=0,d;
	printf("Enter The Number :");
	scanf("%d",&n);
	while(n!=0){
		d=n%10;
		n=n/10;
		s=(s*10)+d;
	}
	printf("The Reverse Of Number Is %d",s);
}