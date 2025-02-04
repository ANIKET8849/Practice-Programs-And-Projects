#include<stdio.h>
#include<cmath>
#include<conio.h>

int main(){
	int n,n1,n2,s=0,d,c=0,a,b,i;
	printf("Enter Two Numbers :");
	scanf("%d %d",&a,&b);
	i=a;
	while(i<=b){
	c=0;
	s=0;
	n=i;
	n1=n;
	n2=n;
	while(n>0){
		d=n%10;
		n=n/10;
		c++;
	}

	while(n1>0){
		d=n1%10;
		n1=n1/10;
		s=s+pow(d,c);
	}
	i++;
	if(n2==s){
		printf("\n%d",n2);
	}	
	}
}