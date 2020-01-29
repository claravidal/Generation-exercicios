import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class StudentsService {

  constructor(private http: HttpClient, private router: Router) { }
  public getAll(){
    let token = localStorage.getItem("token");
       return this.http.get("http://localhost:8080/students/all?token="+token);
  }

}
