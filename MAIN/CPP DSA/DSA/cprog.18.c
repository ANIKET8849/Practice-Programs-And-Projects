#include<stdio.h>
#include<conio.h>

int main(){
	int a[4][4],i,j,r=0,c=0;
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			printf("Enter The Element To  Add : ");
			scanf("%d",&a[i][j]);
		}
	printf("\n");
	}
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			r=r+a[i][j];
			c=c+a[j][i];
		}
		
	printf("\n%d",r);
	printf("\n%d",c);
	r=0;
	c=0;
	}
}