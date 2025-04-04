import { Component } from '@angular/core';
import { RegisterService } from '../../services/register.service';
import { User } from '../../classes/user';

@Component({
  selector: 'app-register',
  standalone: false,
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {
  user: User = new User();

  constructor(private registrationService: RegisterService) {}

  onSubmit() {
    this.registrationService.registerUser(this.user).subscribe(
      response => {
        console.log("Success Response:", response); // Debugging
        alert('Registered Successfully!');
        this.resetForm();
      },
      error => {
        console.error("Error Response:", error); // Debugging
        alert('Error registering user!');
      }
    );
  }
  

  resetForm() {
    this.user = new User();
  }

}
