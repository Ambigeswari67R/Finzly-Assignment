console.log("Hello world");
console.log(` Hello
        Good Morning  `);

// Data type

var aa:number=10; // Forward declaration and definition
console.log(`value of a ${aa}`)
var str:string="null";
console.log(`value of a ${str}`)
var a2!:boolean;
console.log(`value of a2 `+a2)



var a1!:string;
var $a2;
//a1="Ambika";
console.log(`value of a1 ${a1}`);

var str1:any; // ! not required for any data type default value assign- undefined
console.log(`value of str `+str1)

var str2:any;
str2="ambika";
str2=11;
str2=true;
console.log(`value of str2 `+str2)

var x:number|string|any;
x=1;
x="ambika";
x=false;
console.log(`value of x ${x}`);


var c:10|string;
c=10;
c="ambika"
console.log(c)