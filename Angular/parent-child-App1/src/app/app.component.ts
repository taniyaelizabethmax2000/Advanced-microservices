import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'parent-child-App1';


  name = 'Angular 5';
  count: number = 0;
 
 updateFromChild(count:number){
   this.count++;
 }
 
 reset(){
   this.count = 0;
 }
}
