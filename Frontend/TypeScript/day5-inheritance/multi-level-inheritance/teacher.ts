import { student } from "./student";

export class teacher extends student{
    private subject:string;

    constructor(name:string,age:number,id:number,subject:string){
        super(name,age,id);
        this.subject=subject;
    }
    introduce(): void {
        console.log(`
        Name: ${this.getName()}
        Teacher id: ${this.getId()}
        is teaching ${this.subject}`)
    }
}
