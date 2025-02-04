#include<stdio.h>
#include<conio.h>

int main(){
	int a,b,c;
	printf("Enter The Three Numbers :");
	scanf("%d %d %d",&a,&b,&c);
	if(a>b && a>c){
		printf("The Greater Number Is : %d",a);
	}else if(b>a && b>c){
		printf("The Greater Number Is : %d",b);
	}else if(c>a && c>b){
		printf("The Greater Number Is : %d",c);
	}
}