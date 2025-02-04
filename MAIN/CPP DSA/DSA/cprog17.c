#include<stdio.h>
#include<conio.h>

int main(){
	int a[3][3],i,j,s=0,min,max,average=0;
	
	for(i=0; i<=2; i++){
		for(j=0; j<=2; j++){
			printf("Enter Element To Add : ");
			scanf("%d",&a[i][j]);
		}
		printf("\n");
	}
	min=a[0][0];
	for(i=0; i<=2; i++){
		for(j=0; j<=2; j++){
			if(a[i][j]<min){
				min=a[i][j];
			}
			max=a[0][0];
			if(a[i][j]>max){
				max=a[i][j];
			}
			s=s+a[i][j];
		}
	}
	printf("\n%d",min);
	printf("\n%d",max);
	printf("\n%d",s);
	average=s/9;
	printf("\n%d",average);

}