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
	struct employe e[3];
	
	for(int i=0; i<3; i++){
		printf("\n Enter Employee No. : ");
		scanf("%d",&e[i].emp_no);
	
		printf("\n Enter Employee Name : ");
		fflush(stdin);
		gets(e[i].name);

		printf("\n Enter Employee Div : ");
		scanf("%d",&e[i].div);

		printf("\n Enter Employee Present Date : ");
		scanf("%d",&e[i].p_days);

		printf("\n Enter Employee Daily Salary : ");
		scanf("%d",&e[i].d_sal);
	}
	
	for(int i=0; i<3; i++){
		e[i].total=e[i].p_days*e[i].d_sal;
		e[i].hra=(e[i].total/100)*10;
		e[i].va=(e[i].total/100)*5;
		e[i].pf=(e[i].total/100)*8;
		e[i].gsal=e[i].total+e[i].hra+e[i].va-e[i].pf;
	}
	
	printf("\nEMPLOYEE RECORD : ");
	printf("\n\t Employee No. \tEmployee Name \tDivision \tPresent Days \tDaily Salary \tTotal Salary \tHRA \tVehicle Allwance \tPF \tGross Salary ");

	for(int i=0; i<3; i++){
		printf("\n\t %d \t %s \t %d \t %d \t %d \t %f \t %f \t %f \t %f  \t %f ",e[i].emp_no,e[i].name,e[i].div,e[i].p_days,e[i].d_sal,e[i].total,e[i].hra,e[i].va,e[i].pf,e[i].gsal);
		printf("__________________________________________________________________________________________________________________________________________________________________________________________");
	}
	
}