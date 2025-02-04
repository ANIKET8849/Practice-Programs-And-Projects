#include<stdio.h>
#include<conio.h>

int main(){
	int n,i,r=0;
	printf("Enter The Number : ");
	scanf("%d",&n);
	for(i=1; i<n; i++){
		if(n%i==0){
			r=r+i;
		}
	}
	if(r>n){
		printf("The Number Is Abundend Number : %d",n);
	}else{
		printf("The Number Is Not A Abundend Number : %d",n);
	}
}