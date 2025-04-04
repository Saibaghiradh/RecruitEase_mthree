import { Component, OnInit } from '@angular/core';
import { Jobdetails } from '../../classes/jobdetails';
import { HomeService } from '../../services/home.service';

@Component({
  selector: 'app-home',
  standalone: false,
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit{

  jobs:Jobdetails[]=[];

  constructor(private homeservice: HomeService ){}

  ngOnInit(): void {
    this.myjobdetails();
  }

  myjobdetails()
  {
    this.homeservice.details().subscribe(data => {this.jobs = data})
  }
  

}
