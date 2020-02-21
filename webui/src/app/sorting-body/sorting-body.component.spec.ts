import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SortingBodyComponent } from './sorting-body.component';

describe('SortingBodyComponent', () => {
  let component: SortingBodyComponent;
  let fixture: ComponentFixture<SortingBodyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SortingBodyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SortingBodyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
