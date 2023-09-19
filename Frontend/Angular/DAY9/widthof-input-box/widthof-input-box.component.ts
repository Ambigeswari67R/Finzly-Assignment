import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-widthof-input-box',
  templateUrl: './widthof-input-box.component.html',
  styleUrls: ['./widthof-input-box.component.css']
})
export class WidthofInputBoxComponent implements OnInit {
  userInput='';
  inputWidth=100;

  constructor() { }

  ngOnInit(): void {
  }
  
 
  updateInputWidth() {
    
    this.inputWidth = this.userInput.length * 10; // Adjust the multiplier as needed
  }

}
