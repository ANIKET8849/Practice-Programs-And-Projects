#include<stdio.h>
#include<conio.h>

int main(){
	int n,s=0,d,n1;
	printf("Enter The  Number :");
	scanf("%d",&n);
	n1=n;
		while(n1>0){
			d=n1%10;
			n1=n1/10;
			s=s+d;
		}
		if(n%s==0){
				printf(" %d The Number Is Harshad number",n);
		}else{
				printf(" %d The Number Is Not Harshad number",n);
		}
}