#include<stdio.h>
#include<conio.h>

int main(){
	int a[4][4],i,j,c=0;
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			printf("Enter The Element To  Add : ");
			scanf("%d",&a[i][j]);
		}
	printf("\n");
	}
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			if(j%2==0){
				printf(" %d ",a[i][j]);
			}
			else{
				printf(" %d ",c);
			}
		}
		printf("\n");
	}
}