import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'parent-child-App';
  enterName="Taniya";
  enterJob="Engineer"
  parentData="";
  parentData1="";

 transferData(){
    this.parentData=this.enterName;
  
  }
 transferJobData(){
  this.parentData1=this.enterJob;
 }

 
 value="";
 sendData(value:string){
  this.value=value;
 }
 
}
