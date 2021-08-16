import { TestBed } from '@angular/core/testing';

import { StudentFacadeService } from './student-facade.service';

describe('StudentFacadeService', () => {
  let service: StudentFacadeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(StudentFacadeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
