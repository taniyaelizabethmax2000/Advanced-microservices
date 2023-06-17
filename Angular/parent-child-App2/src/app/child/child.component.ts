import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

 
 constructor() { }

  ngOnInit() {
  }

 @Output() colors = new EventEmitter;

 send(t: { value: any; }){
   this.colors.emit(t.value);
 }
}
