#include<stdio.h>
#include<conio.h>

int main(){
	int n,s=0,n1,d;
	printf("Enter The  Number :");
	scanf("%d",&n);
	n1=n*n;
		while(n1>0){
			d=n1%10;
			n1=n1/10;
			s=s+d;
			if(s==n){
				printf(" %d The Number Is Automorphic number",n);
			}
		}
}