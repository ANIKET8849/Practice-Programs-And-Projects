#include<stdio.h>
#include<conio.h>

int main(){
	int n;
	printf("Enter The Number :");
	scanf("%d",&n);
	if(0<n){
		printf("%d The Number Is Positive Number ",n);
	}else{
		printf("%d The Number Is Negative Number ",n);
	}
}