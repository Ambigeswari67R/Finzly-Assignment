import { person } from "./person";

export class student extends person{
    private id:number;

    constructor(name:string,age:number,id:number){
        super(name,age);
        this.id=id;
    }

    getId(){
        return this.id;
    }
    setId(id:number){
        this.id=id;
    }
    
    introduce(): void {
        console.log(`
        Name: ${this.getName()}
        Student id: ${this.id}
        is studying.`)
    }
}