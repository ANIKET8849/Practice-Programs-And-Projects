#include<iostream>
using namespace std;

class bike{
    char company[100];
    char model[100];
    int cc[10];
    int mileage[10];
    public:
    void getdata(){
        cout<<"Enter the Brand name : ";
        cin.getline(company, 100);
        cin.ignore();
        cout<<"Enter the model name : ";
        cin.getline(model, 100);
        cin.ignore();
        cout<<"Enter the cc : ";
        cin.getline(cc, 10);
        cin.ignore();
        cout<<"Enter the mileage : ";
        cin.getline(mileage, 10);
        cin.ignore();
    }
    void showdata(){
        cout<<"\nBrand Name : "<<company<<endl;
        cout<<"\nModel Name : "<<model<<endl;
        cout<<"\nCC : "<<cc<<endl;
        cout<<"\nMileage : "<<mileage<<endl;

    }
};
int main(){
    bike b[50];
    int size;
    cout<<"Enter Number Of Bike You Want To Add : "<<size<<endl;
    cout<<"Enter The Data Of :"<<size<<"bikes : "<<endl;
    for(int i=0; i<size; i++){
        b[i].getdata();
    }
    cout<<"The Information Is : "<<endl;
    for(int i=0; i<size; i++){
        b[i].showdata();

    }
    return 0;


}
