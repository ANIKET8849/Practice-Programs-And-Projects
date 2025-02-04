#include<stdio.h>
#include<conio.h>

int main(){
	int a[4][4],i,j;
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			printf("Enter The Element To  Add : ");
			scanf("%d",&a[i][j]);
		}
	printf("\n");
	}
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			printf("%d",a[j][i]);
		}
		printf("\n");
	}
		
}