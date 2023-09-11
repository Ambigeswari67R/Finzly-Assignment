export class vehicle{
    private make:string;
    private model:string

    constructor(make:string,model:string){
        this.make=make;
        this.model=model;

    }
    start(){
        console.log(`Starting the vehicle.`);

    }
    stop(){
        console.log(`Stopping the vehicle.`);

    }
    displayInfo(){
        console.log(`
                 Make: ${this.make}
                 Model: ${this.model}`)
    }
}
