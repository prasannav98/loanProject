import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThirdPageViewComponent } from './third-page-view.component';

describe('ThirdPageViewComponent', () => {
  let component: ThirdPageViewComponent;
  let fixture: ComponentFixture<ThirdPageViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThirdPageViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThirdPageViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
