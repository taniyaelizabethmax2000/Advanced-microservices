import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  @Input("parentCount")
  count!: number;
  
  
  @Output()
  updateFromChild: EventEmitter<number> = new EventEmitter<number>();
  
 

  constructor() { }

  ngOnInit() {
  }
  updateCount() {
    this.count++;
    this.updateFromChild.emit(this.count);
  }
}
