import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../../services/login.service';

@Component({
  selector: 'app-login',
  standalone: false,
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  loginData = {
    uname: '',
    password: ''
  };

  constructor(private loginService: LoginService, private router: Router) {}

  onLogin() {
    this.loginService.loginUser(this.loginData).subscribe(
      (response: any) => {
        alert(response.message); // Show success message
        console.log("HIII")
        this.router.navigate(['/home']); // Navigate to home page
      },
      (error) => {
        console.log(error);
        alert(error.error.message || 'Login failed!'); // Show error message
      }
    );
  }

}
