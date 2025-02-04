#include<stdio.h>
#include<conio.h>

int main(){
	int n;
	printf("Enter The Number :");
	scanf("%d",&n);
	if(n%2==0){
		printf("%d The Number Is Even Number ",n);
	}else{
		printf("%d The Number Is Odd Number ",n);
	}
}