// //type script
var a:any;
var temp=(<string>a);
console.log(temp)
//anonymous 
let temp1=function (){
    console.log("hiiiiiiii")
}
temp1()

//fat arrow
let display=()=>{
    console.log("Hello")
}
display();
let temp2=(a:number,b:number):number=>{
   return (a+b);
}
console.log(temp2(10,5));