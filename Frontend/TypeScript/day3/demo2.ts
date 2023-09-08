let arr1:number[]=[10,20,30];
let arr2:number[]=[];
let arr3=[2.5,4.5,6];
let arr4=["Raokhande",40,'Sumit',true];
let arr5:any[]=[5,"Sumit",5.6,true];
//------
let a3=[10,2.0,"any",true];
let arr:number[]=[10,20];
for(let i=0;i<arr1.length;i++){
    console.log(arr1[i])
}

a.forEach((k,i,arr)=>{
        console.log("Data is "+k+" index is "+i+" array is "+arr);
    });

 let strcourse:string[]=["Core java",'Advnaced Java','Spring boot','Angular 12','Docker','Jenkings','AWS'];
 for(let i=0;i<strcourse.length;i++){
    console.log(strcourse[i])
 }
let student:string[]=[]
student.push("Ambika");
student.push("Amutha");
student.push("Priya");
student.push("Jaff");
console.log(student.join("*"))
for(let i=0;i<student.length;i++){
    console.log("Name: "+student[i])
}



let copiedDarray=student.slice(1,5);
console.log(student);
console.log(copiedDarray);