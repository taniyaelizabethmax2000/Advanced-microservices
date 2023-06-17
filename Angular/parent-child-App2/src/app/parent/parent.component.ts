import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {

  constructor() { }
  name!: string;
  ngOnInit() {
  }
   f1(e: string){
     this.name = e
   }
}
