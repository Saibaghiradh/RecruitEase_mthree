import { HttpClient } from '@angular/common/http';
import { Injectable, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Jobpost } from '../classes/jobpost';
import { Jobdetails } from '../classes/jobdetails';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  private url = "http://localhost:8080/project/getjobs";

  constructor(private httpclient:HttpClient ) {}

  details():Observable<Jobdetails[]>
  {
    return this.httpclient.get<Jobdetails[]>(this.url);
  }
 
}
