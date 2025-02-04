#include<stdio.h>
#include<conio.h>

int main(){
	int a,b;
	printf("Enter The Two Numbers :");
	scanf("%d %d",&a,&b);
	if(a>b){
		printf("The Greater Number Is : %d",a);
	}else{
		printf("The Greater Number Is : %d",b);
	}
}