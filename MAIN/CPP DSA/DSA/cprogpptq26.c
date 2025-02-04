#include<stdio.h>
#include<conio.h>

int main(){
	int n1,n2,i,r1,r2;
	printf("Enter The Numbers : ");
	scanf("%d %d",&n1,&n2);
	for(i=1; i<=10; i++){
		r1=n1*i;
		r2=n2*i;
		if(r1==r2){
			printf(" %d",r1);
		}
	}
	printf(" %d",n1);
}