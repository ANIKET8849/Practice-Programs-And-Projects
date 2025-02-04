#include<stdio.h>
#include<conio.h>

int main(){
	char name[100];
	int i,a,b=1;
	printf(" Enter Your Name : ");
	gets(name);
	printf("\nName Is %s",name);
	for(i=0; name[i]!='\0'; i++){
		if(name[i]==' '){
			b++;
		}
	}
	
	printf("\nThe Words In This String Is %d\n",b);
}