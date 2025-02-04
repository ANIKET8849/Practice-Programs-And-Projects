#include<stdio.h>
#include<conio.h>

int main(){
	int n,b=1,s=0;
	printf("Enter The Number :");
	scanf("%d",&n);
	while(b<n){
		if(n%b==0){
			s=s+b;
		}
		b++;
		
	}
	if(s==n){
			printf("%d The Number Is Perfect Number : ",n);
		}else{
			printf("%d The Number Is Not Perfect Number : ",n);
		}

}