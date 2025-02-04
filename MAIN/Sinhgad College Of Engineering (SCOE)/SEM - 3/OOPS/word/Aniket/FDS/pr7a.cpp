#include<stdio.h>
#include <iostream>
#include<string>
using namespace std;
class list;
class node
{
	int prn;
	string name;
	node *next;
	public:
	node(int x,string nm)
	{
		prn=x;
		next=NULL;
		name=nm;
	}
	friend class list;
};
class list
{
	node *start;
	public:
	list()
	{
		start=NULL;
	}
	void create();
	void display();
	void insertAtBeginning();
	void deleteAtFirst();
};
void list::create()
{
	int no;
	string nam;
	if(start==NULL)
	{
		cout<<"Enter PRN number: ";
		cin>>no;
		cout<<"Enter name: ";
		cin>>nam;
		start=new node(no,nam);
		cout<<"\n====== List Created =====";
	}
	else
	{
		cout<<"\nList is already created.";
	}
}
void list::display()
{
	node *t;
	t=start;
	if(start==NULL)
		cout<<"\nList is Empty";
	else
	{ 
		cout<<"\n====== List: ======\n";
		while(t!=NULL)
		{
			cout<<t->prn<<" "<<t->name<<" \n";
			t=t->next;
		}
	}
}
void list::insertAtBeginning()
{
	int no;
	string nam;
	node *temp;
	if(start==NULL)
	{
		create();
	}
	else
	{
		cout<<"\nEnter PRN number: ";
		cin>>no;
		cout<<"\nEnter name: ";
		cin>>nam;
		temp=new node(no,nam);
		temp->next=start;
		start=temp;
		cout<<"Inserted "<<temp->name<<" at the beginning.";
	}
}
void list::deleteAtFirst()
{
	node *t;
	if(start==NULL)
		cout<<"\nClub is Empty..";
	else
	{
		t=start;
		start=start->next;
		delete t;
		cout<<"\nPresident deleted..";
	}
}
int main() 
{
	list *l;
	int choice;
	list l1;
	l=&l1;
	
	do
	{
		cout<<"\n1. Create\n2. Add President\n3. Display list";
		cout<<"\n4. Delete President\n0. Exit\nEnter your choice: \t";
		cin>>choice;
		switch(choice)
		{
			case 1: l->create();
					break;
			case 2: l->insertAtBeginning();
					break;
			case 3: l->display();
					break;
			case 4: l->deleteAtFirst();
					break;
			deafult:
				cout<<"Wrong choice";
		}
	}while(choice!=0);
	return 0;
}

