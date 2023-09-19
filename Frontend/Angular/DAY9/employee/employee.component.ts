import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  empData:any[]=[];
  constructor() { }

  ngOnInit(): void {
  }

  onAdd(id:any,name:any,salary:any){

    let obj={
      id:id,
      name:name,
      sal:salary
    }

    this.empData.push(obj);


  }

  onRemove(index:any){

    this.empData.splice(index,1);

  }


}
