import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  @Input() parentData!:string
data: any="msgtoparent"

@Output() public sendto=new EventEmitter<string>();

sendtoparent(){
  this.sendto.emit(this.data);
}
}
  

