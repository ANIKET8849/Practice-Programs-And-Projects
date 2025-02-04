let num = parseInt(prompt("Enter the num"));
let temp = num;

let rev = 0;
let rem;
function reverse(){
   while(num>0){
    rem = num%10;
    num = (num-rem)/10;
    rev = rev*10+rem;
   }

   document.write("Original num is = " + temp +" <br>");
   document.write("Reverse num is = " + rev);

}

document.getElementById("btn").addEventListener("click",reverse);