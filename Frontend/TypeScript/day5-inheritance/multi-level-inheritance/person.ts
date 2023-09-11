export class person{
    private name:string;
    private age:number

    constructor(name:string,age:number){
        this.name=name;
        this.age=age;

    }
    getName(){
        return this.name;

    }
    setRole(name:string){
        this.name=name;
    }
    getAge(){
        return this.age;
    }
    setAge(age:number){
        this.age=age;
    }


    introduce(){
        console.log(`
        My name is  + ${this.name} +  and I am  + ${this.age} + years old.`);
    }
}