import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-class-binding',
  templateUrl: './class-binding.component.html',
  styleUrls: ['./class-binding.component.css']
})
export class ClassBindingComponent implements OnInit {
  isItalic:boolean=false;
  isChange:boolean=false

  constructor() { }
  onClick()
  {
    this.isItalic=!this.isItalic;
    this.isChange=!this.isChange;
  }
  ngOnInit(): void {
  }

}
