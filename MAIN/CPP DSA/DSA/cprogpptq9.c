#include<stdio.h>
#include<conio.h>

int main(){
	int a,b,i,j,r=0;
	printf("Enter The Range : ");
	scanf("%d %d",&a,&b);
	for(i=a; i<=b; i++){
               r=0;
		for(j=1; j<=i; j++){
			if(i%j==0){
				r++;
			}
		}
		if(r<=2){
			printf("  %d",i);
		}
	}

}