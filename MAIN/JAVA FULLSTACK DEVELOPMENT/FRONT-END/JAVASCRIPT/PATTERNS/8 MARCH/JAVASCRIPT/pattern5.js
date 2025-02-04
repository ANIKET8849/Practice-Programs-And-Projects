let i,j;
for(i=1;i<=10;i++){
    for(j=1;j<=10;j++){
        if(i==1 || i==10 || j==1 || j==10){
            document.write("*");
        }
        else{
            document.write("&nbsp;&nbsp;");
        }
    }
    document.write("<br>");
}