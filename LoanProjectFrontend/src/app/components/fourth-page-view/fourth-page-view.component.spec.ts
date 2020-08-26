import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FourthPageViewComponent } from './fourth-page-view.component';

describe('FourthPageViewComponent', () => {
  let component: FourthPageViewComponent;
  let fixture: ComponentFixture<FourthPageViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FourthPageViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FourthPageViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
