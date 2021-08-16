import { TestBed } from '@angular/core/testing';

import { AdminFacadeService } from './admin-facade.service';

describe('AdminFacadeService', () => {
  let service: AdminFacadeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminFacadeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
