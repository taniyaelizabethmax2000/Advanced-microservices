import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ButtonComponent } from './button.component';

// describe('ButtonComponent', () => {
//   let component: ButtonComponent;
//   let fixture: ComponentFixture<ButtonComponent>;

//   beforeEach(async () => {
//     await TestBed.configureTestingModule({
//       declarations: [ ButtonComponent ]
//     })
//     .compileComponents();

//     fixture = TestBed.createComponent(ButtonComponent);
//     component = fixture.componentInstance;
//     fixture.detectChanges();
//   });

describe('ButtonComponent', () => {
  let component: ButtonComponent;
  let fixture: ComponentFixture<ButtonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ButtonComponent]
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ButtonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should render the button with the provided label', () => {
    component.label = 'Click Me';
    fixture.detectChanges();
    const buttonElement = fixture.nativeElement.querySelector('button');
    expect(buttonElement.textContent).toContain('Click Me');
  });

  it('should emit the clicked event when the button is clicked', () => {
    spyOn(component.clicked, 'emit');
    const buttonElement = fixture.nativeElement.querySelector('button');
    buttonElement.click();
    expect(component.clicked.emit).toHaveBeenCalled();
  });
});