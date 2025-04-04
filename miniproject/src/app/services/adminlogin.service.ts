import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminloginService {

  private baseUrl = 'http://localhost:8080/project';

  constructor(private http: HttpClient) {}

  loginUser(loginData: any): Observable<any> {
    
    return this.http.post(`${this.baseUrl}/adminlogin`, loginData);

  }
}
