import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Jobpost } from '../classes/jobpost';

@Injectable({
  providedIn: 'root'
})
export class JobService {

  private apiUrl = 'http://localhost:8080/project/addpost';

  constructor(private http: HttpClient) {}

  jobPost(job: Jobpost): Observable<any> {
    return this.http.post<any>(this.apiUrl, job);

  }
}
