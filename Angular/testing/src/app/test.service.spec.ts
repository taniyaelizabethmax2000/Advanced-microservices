import { TestBed } from '@angular/core/testing';

import { TestService } from './test.service';

describe('TestService', () => {
  let service: TestService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TestService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('computes factorial of 5 and gives 120',
()=>{
  let service = new TestService();
  let result = service.factorial(5);
  expect(result).toBe(120);
});//end of it

it('computes sum of 5 and 6 and gives 11',
()=>{
  let service = new TestService();
  let result = service.sum(5,6);
  expect(result).toBe(11);
});//end of it


});
