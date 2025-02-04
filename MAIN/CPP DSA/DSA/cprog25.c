#include<stdio.h>
#include<conio.h>

int main(){
	int a[4][4],i,j,b[4][4],c[4][4];
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			printf("Enter The Element To  Add In First Matrix : ");
			scanf("%d",&a[i][j]);
		}
	printf("\n");
	}
	
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			printf("Enter The Element To  Add In Second Matrix : ");
			scanf("%d",&b[i][j]);
		}
	printf("\n");
	}
	
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			c[i][j]=a[i][j]*b[i][j];
			printf("  %d*%d  ",a[i][j],b[i][j]);
		}
		printf("\n");
	}
	printf("\n\n\n");
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			c[i][j]=a[i][j]*b[i][j];
			printf("     %d",c[i][j]);
		}
		printf("\n");
	}
}