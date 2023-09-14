import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-prime-number',
  templateUrl: './prime-number.component.html',
  styleUrls: ['./prime-number.component.css']
})
export class PrimeNumberComponent implements OnInit {
  number!: number;
  isPrime!: boolean;


  ngOnInit(): void {
  }


  checkPrime() {
    if (this.number <= 1) {
      this.isPrime = false;
      return;
    }

    if (this.number === 2) {
      this.isPrime = true;
      return;
    }

    for (let i = 2; i <= Math.sqrt(this.number); i++) {
      if (this.number % i === 0) {
        this.isPrime = false;
        return;
      }
    }

    this.isPrime = true;
  }

}
