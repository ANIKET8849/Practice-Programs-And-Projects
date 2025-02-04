#include<stdio.h>
#include<conio.h>

int main(){
	int n,b=1,s=1;
	printf("Enter The nth Number :");
	scanf("%d",&n);
	while(b<=n){
		s=b*s;
		b++;
	}
	printf(" %d",s);

}