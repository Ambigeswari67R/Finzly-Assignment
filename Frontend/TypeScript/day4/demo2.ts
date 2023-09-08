export class Employee{
    public id:number;
    private name:string;
    protected salary: number;

    constructor(id:number,name:string,salary: number){
        this.id=id;
        this.name=name;
        this.salary=salary;
        
    }

    display(){
        console.log(` 
                   ID : ${this.id}
                   NAME : ${this.name}
                   SALARY: ${this.salary}`
                   )
    }
 
}
// let obj=new Employee(1,'Ambika',50000)
// obj.display();
 export function avgSalary(a:number,b:number){
    console.log(`
                Average Salary : ${(a+b)/2} `)

 }