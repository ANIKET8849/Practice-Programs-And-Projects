#include<stdio.h>
#include<conio.h>

int main(){
	int a[4][4],i,j,b[4][4];
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			printf("Enter The Element To  Add : ");
			scanf("%d",&a[i][j]);
		}
	printf("\n");
	}
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			b[i][j]=a[i][j];
			printf("%d",b[i][j]);
		}
		printf("\n");
	}
}