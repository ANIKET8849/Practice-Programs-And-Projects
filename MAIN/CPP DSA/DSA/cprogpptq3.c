#include<stdio.h>
#include<conio.h>

int main(){
	int n,s=0;
	printf("Enter The Number :");
	scanf("%d",&n);
	for(int i=0; i<=n; i++){
		s=s+i;
	}
	printf("The Sum Of Natural Number Is %d",s);
}