#include<stdio.h>
#include<conio.h>

int main(){
	int a[10],i,max,smax;
	for(i=0; i<10; i++){
		printf("Enter Element To Add : ");
		scanf("%d",&a[i]);
	}
	max=a[0];
	smax=a[0];
	for(i=0; i<10; i++){
		if(a[i]>max){
			smax=max;
			max=a[i];
		}
		else if(a[i]>max && a[i] != max){
			smax=a[i];		
		}
	}
	if(max==smax){
		printf("\nThere Is No Second Largest Element In Array ");
	}
	else{
		printf("\nThere Is Second Largest Element In Array ",smax);
	}
	printf("\n%d",max);
	printf("\n%d",smax);
}