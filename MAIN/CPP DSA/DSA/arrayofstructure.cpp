#include<iostream>
using namespace std;
struct student{
	char name[20];
	int rollno;
	int std;
};
int main(){
	struct student s[3];
	for(int i=0; i<3; i++){
		 cout<<"Enter The Student Name : "; 
 		 cin>>s[i].name;
		 cout<<"Enter The Student Rollno : "; 
  		cin>>s[i].rollno;
   		cout<<"Enter The Student STD : "<<"\n"; 
  		cin>>s[i].std;
	}
	for(int i=0; i<3; i++){
		 cout<<"\nEnter The Student Name : "<<s[i].name; 
		 cout<<"\nEnter The Student Rollno : "<<s[i].rollno;
   		cout<<"\nEnter The Student STD : "<<s[i].std<<"\n\n"; 
	}
}