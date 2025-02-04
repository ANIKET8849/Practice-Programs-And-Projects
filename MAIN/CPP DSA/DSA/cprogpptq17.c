#include<stdio.h>
#include<conio.h>

int main(){
	int n,b=1;
	printf("Enter The nth Number :");
	scanf("%d",&n);
	while(b<=n){
		if(n%b==0){
			printf("%d ",b);
		}
		b++;
	}
	

}