import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FirstPageWelcomeComponent } from './first-page-welcome.component';

describe('FirstPageWelcomeComponent', () => {
  let component: FirstPageWelcomeComponent;
  let fixture: ComponentFixture<FirstPageWelcomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FirstPageWelcomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FirstPageWelcomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
