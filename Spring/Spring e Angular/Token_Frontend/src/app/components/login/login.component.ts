import { User } from './../../model/User';
import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { Router } from '@angular/router';
import { Token } from 'src/app/model/Token';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: User = new User();
  constructor(private srv:UserService, private router: Router) { }

  ngOnInit() {
  }

  public enviarDados(){
    console.log(this.user);
    this.srv.autenticate(this.user).subscribe(
      (res: Token)=>{
        localStorage.setItem("token",res.token);
        console.log(res);
        this.router.navigate(["/lista"]);
        console.log()
      },
      (err)=>{
        console.log(err);
        alert("Ta errado!");
      }
    );
 }

}
