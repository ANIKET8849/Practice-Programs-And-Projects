var a=parseInt(prompt("Enter First Number"));
var b=parseInt(prompt("Enter second Number"));
var c=parseInt(prompt("Enter third Number"));
if(a>b){
    if(a>c){
        document.write(a+" IS THE LARGE NUMBER");
    }
    else{
        document.write(c+" IS THE LARGE NUMBER");
    }
}
else{
    if(b>c){
        document.write(b+" IS THE LARGE NUMBER");
    }
    else{
        document.write(c+" IS THE LARGE NUMBER");
    }
}