import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AdminloginService } from '../../services/adminlogin.service';

@Component({
  selector: 'app-admin',
  standalone: false,
  templateUrl: './admin.component.html',
  styleUrl: './admin.component.css'
})
export class AdminComponent {

  loginData = {
    email: '',
    password: ''
  };
  constructor(private loginService: AdminloginService, private router: Router) {}

  onAdminLogin() {
    this.loginService.loginUser(this.loginData).subscribe(
      (response: any) => {
        alert(response.message); // Show success message
        console.log("HIII")
        this.router.navigate(['/adminhome']); // Navigate to home page
      },
      (error) => {
        console.log(error);
        alert(error.error.message || 'Login failed!'); // Show error message
      }
    );
  }

}
