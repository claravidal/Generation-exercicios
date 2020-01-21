import { StudentsService } from './../../services/students.service';
import { Component, OnInit } from '@angular/core';
import { Student } from 'src/app/model/Student';
import { Router } from '@angular/router';


@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  
  public listStudents: Student[];
  constructor(private srv: StudentsService, private router: Router) { }
  ngOnInit() {
    this.srv.getAll().subscribe(
      (res: Student[])=>{
          this.listStudents = res;
  },
  (err)=>{
    alert("Não autenticado!!");
    this.router.navigate(["/login"]);
  });
}
}