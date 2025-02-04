#include<stdio.h>
#include<conio.h>

int main(){
	int n,a,s=0;
	printf("Enter The Numbers In Range :");
	scanf("%d %d",&a,&n);
	for(int i=a; i<=n; i++){
		s=s+i;
	}
	printf("The Sum Of Natural Number Is %d",s);
}