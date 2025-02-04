#include<iostream>
using namespace std;

int main(){
	int i,j;
	char a[100],b[100];
	printf("Enter The String : ");
	gets(a);
	
	for(i=0; a[i]!='\0'; i++){
		if(a[i]>='a' && a[i]<='z'){
			b[i]=a[i]-32;
		}else{
			b[i]=a[i];
		}
		printf("%c",b[i]);
	}
	printf("\n\n");

	printf("Enter The String : ");
	gets(a);
	printf("\n");


	for(i=0; a[i]!='\0'; i++){
		if(a[i]>='A' && a[i]<='Z'){
			b[i]=a[i]+32;
		}else{
			b[i]=a[i];
		}
		printf("%c",b[i]);
	}
	printf("\n\n");


	printf("Enter The String : ");
	gets(a);
	printf("\n");
	for(i=0; a[i]!='\0'; i++){
		if(a[i]>='A' && a[i]<='Z'){
			b[i]=a[i]+32;
		}else if(a[i]>='a' && a[i]<='z'){
			b[i]=a[i]-32;
		}else{
			b[i]=a[i];
		}
		printf("%c",b[i]);
	}
	printf("\n\n");
	

	printf("Enter The String : ");
	gets(a);
	printf("\n");
	for(j=0; a[j]!='\0'; j++){
		for(i=0; a[i]!=' '; i++){
			i++;
			if(a[i]>='a' && a[i]<='z'){
				b[i]=a[i]-32;
			}else{
				b[i]=a[i];
			}
		}
		printf("%c",b[i]);
	}
	
}