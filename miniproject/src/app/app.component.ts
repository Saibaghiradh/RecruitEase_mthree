import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: false,
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'miniproject';

  activeSection = 'home';

  constructor(private router: Router) {}

  isOtherRoute(): boolean {
    return this.router.url !== '/';
  }

  
  navigateToLogin() {
    console.log('Navigating to Login');
    this.router.navigate(['/login']);
  }

  navigateToRegister() {
    console.log('Navigating to register');
    this.router.navigate(['/register']);
  }

  navigateToAdmin()
  {
     this.router.navigate(['/admin']);
  }


  scroll(sectionId: string) {
    const element = document.getElementById(sectionId);
    if (element) {
      element.scrollIntoView({ behavior: "smooth"});
      this.activeSection = sectionId;
      console.log("Scrolling to " + sectionId);
      // element.scrollIntoView({ behavior: 'smooth', block: 'start' });
    }
  }
  

 
  
}
