import { CommentIdService } from './../service/comment-id.service';
import { Comments } from './../model/comments';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-comment-id',
  templateUrl: './comment-id.component.html',
  styleUrls: ['./comment-id.component.css']
})
export class CommentIdComponent implements OnInit {
  id: number
  comments: Comments = new Comments(0,0," ", " ", " ")
  constructor(private commentIdService: CommentIdService ) { }

  ngOnInit() {
  }
  searchClick (){
  this.commentIdService.get(this.id).subscribe((commentOut: Comments) =>{
    this.comments = commentOut;
  })
    
  }   

 }
