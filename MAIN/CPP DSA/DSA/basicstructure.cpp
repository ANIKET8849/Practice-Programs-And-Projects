#include<iostream>
using namespace std;

struct student{
       char name[20];
       int rollno;
       int std;       
};

int main(){
   struct student s1;
   cout<<"\nEnter The Student Name : "; 
   cin>>s1.name;
   cout<<"\nEnter The Student Rollno : "; 
   cin>>s1.rollno;
   cout<<"\nEnter The Student STD : "; 
   cin>>s1.std;
   
   cout<<"\n\nSTUDENT RECORD "<<"\n";
   cout<<"\nStudent Name Is : "<<s1.name;
   cout<<"\nStudent Roll No Is : "<<s1.rollno;
   cout<<"\nStudent STD : "<<s1.std;
   return 0;
}
