#include<stdio.h>
#include<conio.h>

struct employe{
	int emp_no;
	char name[20];
	int div;
	int p_days;
	int d_sal;
	float total;
	float hra;
	float va;
	float pf;
	float gsal;
};

int main(){
	struct employe e1;
	
	printf("\n Enter Employee No. : ");
	scanf("%d",&e1.emp_no);
	
	printf("\n Enter Employee Name : ");
	fflush(stdin);
	gets(e1.name);

	printf("\n Enter Employee Div : ");
	scanf("%d",&e1.div);

	printf("\n Enter Employee Present Date : ");
	scanf("%d",&e1.p_days);

	printf("\n Enter Employee Daily Salary : ");
	scanf("%d",&e1.d_sal);

	e1.total=e1.p_days*e1.d_sal;
	e1.hra=(e1.total/100)*10;
	e1.va=(e1.total/100)*5;
	e1.pf=(e1.total/100)*8;
	e1.gsal=e1.total+e1.hra+e1.va-e1.pf;
	
	printf("\nEMPLOYEE RECORD : ");
	printf("\n %d ",e1.emp_no);
	printf("\n %s ",e1.name);
	printf("\n %d ",e1.div);
	printf("\n %d ",e1.p_days);
	printf("\n %d ",e1.d_sal);
	printf("\n %.2f ",e1.total);
	printf("\n %.2f ",e1.hra);
	printf("\n %.2f ",e1.va);
	printf("\n %.2f ",e1.pf);
	printf("\n %.2f ",e1.gsal);
	
}