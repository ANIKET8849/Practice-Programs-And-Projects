#include<stdio.h>
#include<conio.h>

int main(){
	int n;
	printf("Enter The Year : ");
	scanf("%d",&n);
	if(n%4==0){
		printf("%d The Year Is Leap Year ",n);
	}else{
		printf("%d The Year Is Not A Leap Year ",n);
	}
}