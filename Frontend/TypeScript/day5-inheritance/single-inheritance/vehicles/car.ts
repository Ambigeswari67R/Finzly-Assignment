import { vehicle } from "../vehicle";

export class car extends vehicle{
    private year:number;

    constructor(make:string,model:string,year:number){
        super(make,model);
        this.year=year;
    }

    start(){
        console.log(`Starting the vehicle.`);

    }
    stop(){
        console.log(`Stopping the vehicle.`);

    }
    displayInfo(){
        super.displayInfo();
        console.log(`
                 Year: ${this.year}
                `)
    }
    
}