import { User } from './../model/User';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }
  public autenticate(user: User){
  
    return this.http.post("http://localhost:8080/autenticate", user);
  }
}
