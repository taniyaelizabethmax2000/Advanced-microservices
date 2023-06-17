import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent {
  [x: string]: any;

  @Output() public sendData=new EventEmitter<string>();

  ngOnInit(){
    
  }
  transferChildData(){
    this.sendData.emit('This is Child Data');
  }
}
