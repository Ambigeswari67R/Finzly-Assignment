//optional parameter function
// function add(a?:number,b?:number){
//     console.log("value of a "+a)
//     console.log("value of b "+b)
//     console.log("value of a+b =  "+(a!+b!))
// }
// add(10,5)
//default parameter function
// function add1(a:number,b:number=11){
//     console.log("value of a "+a)
//     console.log("value of b "+b)
//     console.log("value of a+b =  "+(a!+b!))
// }
// add1(10)
// console.log("---------------")
// add1(10,5)
function add2(a, b) {
    if (a === void 0) { a = 20; }
    console.log("value of a " + a);
    console.log("value of b " + b);
    console.log("value of a+b =  " + (a + b));
}
add2(11); //error
console.log("---------------");
add2(10, 5);
