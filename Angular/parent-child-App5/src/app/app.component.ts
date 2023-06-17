import { Component } from '@angular/core';
import { TableExample } from './model/TableExample';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'parent-child-App5';

  constructor(){}
  ngOnInit(): void {
   
  }
  tableData: TableExample[] = [];

  recievedDataFromChild(row: TableExample){
    this.tableData.push(row);
  }
}
