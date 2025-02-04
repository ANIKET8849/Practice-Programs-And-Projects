#include<stdio.h>
#include<conio.h>

int main(){
	int a[3] [3],i,j;
	for(i=0; i<=2; i++){
		for(j=0; j<=2; j++){
			printf("Enter The Element To Add : ");
			scanf("%d",&a[i] [j]);
		}
	}
	for(i=0; i<=2; i++){
		for(j=0; j<=2; j++){
			printf("%d",a[i] [j]);
		}
	printf("\n");
	}
}