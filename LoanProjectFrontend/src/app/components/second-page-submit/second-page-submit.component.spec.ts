import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SecondPageSubmitComponent } from './second-page-submit.component';

describe('SecondPageSubmitComponent', () => {
  let component: SecondPageSubmitComponent;
  let fixture: ComponentFixture<SecondPageSubmitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SecondPageSubmitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SecondPageSubmitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
