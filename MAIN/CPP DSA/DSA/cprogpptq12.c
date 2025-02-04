#include<stdio.h>
#include<cmath>
#include<conio.h>

int main(){
	int n,n1,n2,s=0,d,c=0;
	printf("Enter The Number :");
	scanf("%d",&n);
	n1=n;
	n2=n;
	while(n>0){
		d=n%10;
		n=n/10;
		c++;
	}
	while(n1>0){
		d=n1%10;
		n1=n1/10;
		s=s+pow(d,c);
	}
	if(n2==s){
		printf("The Number Is Armstrong Number ");
	}else{
		printf("The Number Is Not A Armstrong Number ");
	}
}