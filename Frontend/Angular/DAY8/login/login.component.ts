import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  user: any = {};
  submitted = false;

  onSubmit() {
   
    if (this.user.username === 'yourUsername' && this.user.password === 'yourPassword') {
      this.submitted = true;
    }
  }
  
}
