#include<stdio.h>
#include<conio.h>

struct student{
	int rollno;
	char name[20];
	int std;
};

int main(){
	struct student s[5];
	for(int i=0; i<5; i++){
		printf("\nEnter Student Roll no. :");
		scanf("%d",&s[i].rollno);
		printf("\nEnter Student Name :");
		fflush(stdin);
		gets(s[i].name);
		printf("\nEnter Student STD :");
		scanf("%d",&s[i].std);
	}
	
	printf("\nStudent Record : ");
	printf("\n ROLL NO. \t NAME \t STANDARD");
	for(int i=0; i<5; i++){
		printf("\n\t %d \t %s \t %d",s[i].rollno,s[i].name,s[i].std);
		printf("\n______________________________________________________________________________________________________________________");
	}
}