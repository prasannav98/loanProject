import { TestBed } from '@angular/core/testing';

import { LoanApplyService } from './loan-apply.service';

describe('LoanApplyService', () => {
  let service: LoanApplyService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoanApplyService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
