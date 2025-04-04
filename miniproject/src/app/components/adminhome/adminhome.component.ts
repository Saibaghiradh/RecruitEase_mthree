import { Component } from '@angular/core';
import { Jobpost } from '../../classes/jobpost';
import { JobService } from '../../services/job.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminhome',
  standalone: false,
  templateUrl: './adminhome.component.html',
  styleUrl: './adminhome.component.css'
})
export class AdminhomeComponent {

   post: Jobpost = new Jobpost();
  
    constructor(private router:Router,private jobService: JobService) {}
  
    onJobPost() {
      this.jobService.jobPost(this.post).subscribe(
        response => {
          console.log("Success Response:", response); // Debugging
          alert('Registered Successfully!');
          this.router.navigate(['/adminhome']);
          this.resetForm();
        },
        error => {
          console.error("Error Response:", error); // Debugging
          alert('Error registering user!');
        }
      );
    }

    resetForm() {
      this.post = new Jobpost();
    }

}
