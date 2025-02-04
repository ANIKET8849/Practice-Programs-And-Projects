var a=parseInt(prompt("Enter First Number"));
var b=parseInt(prompt("Enter second Number"));
var oprator=prompt("Enter Operator +,-,*,/,%");
var result;

switch(oprator){
    case'+':
        result = a+b;
        document.write("ADDITION IS "+result);
        break;

    case'-':
        result = a-b;
        document.write("SUBSTRATION IS "+result);
        break;

    case'*':
        result = a*b;
        document.write("MULTIPLICATION IS "+result);
        break;

    case'/':
        result = a/b;
        document.write("DIVISION IS "+result);
        break;

    case'%':
        result = a%b;
        document.write("MOD IS "+result);
        break;
}