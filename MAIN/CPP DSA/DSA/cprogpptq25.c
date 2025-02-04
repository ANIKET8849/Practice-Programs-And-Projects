#include<stdio.h>
#include<conio.h>

int main(){
	int n1,n2,i,r1=0,r2=0,c1,c2,j;
	printf("Enter The Numbers : ");
	scanf("%d %d",&n1,&n2);
	for(i=1; i<n1; i++){
		if(n1%i==0){
			r1=i;
		}
		for(j=1; j<n2; j++){
		if(n2%j==0){
			r2=j;
		}
		if(r1==r2){
			c1=r1;
		}
		}
	}
	printf("The Highest Factorial are :  %d",c1);

}