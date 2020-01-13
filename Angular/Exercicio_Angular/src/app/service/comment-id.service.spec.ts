import { TestBed } from '@angular/core/testing';

import { CommentIdService } from './comment-id.service';

describe('CommentIdService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CommentIdService = TestBed.get(CommentIdService);
    expect(service).toBeTruthy();
  });
});
