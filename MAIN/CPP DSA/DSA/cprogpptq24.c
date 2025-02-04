#include<stdio.h>
#include<conio.h>

int main(){
	int n1,n2,i,r1=0,r2=0;
	printf("Enter The Numbers : ");
	scanf("%d %d",&n1,&n2);
	for(i=1; i<n1; i++){
		if(n1%i==0){
			r1=r1+i;
		}
	}
	for(i=1; i<n2; i++){
		if(n2%i==0){
			r2=r2+i;
		}
	}
	c1=r1/n1;
	c2=r2/n2;
	if(c1==c2){
		printf("The Number Is Friendly Pair Number : %d  %d",n1,n2);
	}else{
		printf("The Number Is Not A Friendly Pair Number : %d  %d",n1,n2);
	}
}