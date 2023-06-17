import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'parent-child-App3';
nametochild='parenttochildmessage';
parentData=""

  send(){
this.parentData=this.nametochild;
  }

  value="";
 sendto(value:string){
  this.value=value;
 }
}
