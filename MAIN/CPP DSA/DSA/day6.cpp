// #include<iostream>
// #include<string.h>
// using namespace std;
// class str{
//     char *name;
//     int length;
//     public:
//     str(){
//         length=0;
//         name=new char[length+1];
//     }
//     str(const char *s){
//         length=strlen(s);
//         name=new char[length+1];
//         strcpy(name,s);

//     }
//     void display(){
//         cout<<name<<"\n";

//     }
//     void join(str &,str &);

// };
// void str::join(str &a,str &b){
//     length=strlen(a.name)+strlen(b.name);
//     delete name;
//     name=new char [length+1];
//     strcpy(name,a.name);
//     strcat(name,b.name);

// }
// int main(){
//     const char *first="sapna ";
//     str name1(first);
//     str name2("prajakt "),name3("shravani "),s1,s2;

//     s1.join(name1,name2);
//     s2.join(s1,name3);

//     name1.display();
//     name2.display();
//     name3.display();

//     s1.display();
//     s2.display();
//     return 0;


// }


#include<iostream>
#include<string.h>
using namespace std;

class str
{
    char *name;
    int length;
    public:
    str(){
        length=0;
        name=new char[length+1];

    }
    str(const char *s){
        length=strlen(s);
        name= new char[length+1];
        strcpy(name,s);

    }
    void display(){
        cout<<name<<"\n";

    }
    void join(str &,str &);
};
void str::join(str &a,str &b){
    length=strlen(a.name)+strlen(b.name);
    delete name;
    name=new char[length+1];
    strcpy(name,a.name);
    strcat(name,b.name);
}
int main(){
    const char *first="sapna ";

    str name1(first),name2("prajakt "),name3("shravani "),s1,s2;

    s1.join(name1,name2);
    s2.join(s1,name3);

    name1.display();
    name2.display();
    name3.display();
    s1.display();
    s2.display();
    return 0;
}