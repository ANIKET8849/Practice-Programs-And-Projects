#include<stdio.h>
#include<conio.h>

struct student{
	int rollno;
	char name[20];
	int std;
};

int main(){
	struct student s1;
	printf("\nEnter Student Roll no. :");
	scanf("%d",&s1.rollno);
	printf("\nEnter Student Name :");
	fflush(stdin);
	gets(s1.name);
	printf("\nEnter Student STD :");
	scanf("%d",&s1.std);

	printf("\nStudent Record : ");
	printf("\n %d",s1.rollno);
	printf("\n %s",s1.name);
	printf("\n %d",s1.std);
}