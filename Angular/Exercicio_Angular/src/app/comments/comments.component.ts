import { Comments } from './../model/comments';
import { CommentsService } from './../service/comments.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comments',
  templateUrl: './comments.component.html',
  styleUrls: ['./comments.component.css']
})
export class CommentsComponent implements OnInit {

  constructor(private commentsService: CommentsService) { }

  comment: Comments[];

  ngOnInit() {
    this.findAll();
  }

  findAll() {
    this.commentsService.getAll().subscribe((commentOut: Comments[]) => {
      this.comment = commentOut;
    });
  }
}
