#include<stdio.h>
#include<conio.h>

int main(){
	int n,c=0,a=0,b=1;
	printf("Enter The nth Number :");
	scanf("%d",&n);
	printf(" %d",a);
	printf(" %d",b);

	while(c<n){
		c=a+b;
		a=b;
		b=c;
		printf(" %d",c);
	}

}