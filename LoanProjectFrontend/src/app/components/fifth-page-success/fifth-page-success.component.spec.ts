import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FifthPageSuccessComponent } from './fifth-page-success.component';

describe('FifthPageSuccessComponent', () => {
  let component: FifthPageSuccessComponent;
  let fixture: ComponentFixture<FifthPageSuccessComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FifthPageSuccessComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FifthPageSuccessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
