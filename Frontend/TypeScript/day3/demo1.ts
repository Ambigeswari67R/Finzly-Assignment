
//optional parameter function
function adddisplay(a?:number,b?:number){
    console.log("value of a "+a)
    console.log("value of b "+b)
    console.log("value of a+b =  "+(a!+b!))

}
adddisplay(10,5)

//default parameter function
function add1(a:number,b:number=11){
    console.log("value of a "+a)
    console.log("value of b "+b)
    console.log("value of a+b =  "+(a!+b!))

}
add1(10)
console.log("---------------")
add1(10,5)




//3. Without parameter and with return type
let temp3 = function():number{
    return (10+5);
}
let res = temp3();
console.log("Addition of two numbers is: "+res);

//2. With parameter and without return type

function add(a:number=20,b?:number){
    console.log("value of a "+a)
    console.log("value of b "+b)
    console.log("value of a+b =  "+(a+b!))

}
add(11)//error
console.log("---------------")
add(10,5)