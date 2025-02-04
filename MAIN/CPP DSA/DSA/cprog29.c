#include<stdio.h>
#include<conio.h>

int main(){
	char a[100];
	int i,j,s,e;
	printf("Enter The String : ");
	gets(a);
	for(i=0; a[i]!='\0'; i++){
		s=i;
		while(a[i]!=' ' && a[i]!='\0'){
			i++;
		}
		e=i-1;
		while(e>=s){
			printf("%c",a[e]);
			e--;
		}
		if(a[i]=='\0'){
			break;
		}
		if(a[i]==' '){
			printf(" ");
		}	
	}
}