import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WidthofInputBoxComponent } from './widthof-input-box.component';

describe('WidthofInputBoxComponent', () => {
  let component: WidthofInputBoxComponent;
  let fixture: ComponentFixture<WidthofInputBoxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WidthofInputBoxComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WidthofInputBoxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
