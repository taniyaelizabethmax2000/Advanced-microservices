import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'parent-child-App4';
  name = 'Angular';
  mode = true;
  list = [
    {
      id: 1, name: 'Parent 1', children: [
        { id: 10, name: 'Child 1.1' },
        { id: 11, name: 'Child 1.2' },
        { id: 12, name: 'Child 1.3' }
      ]
    },
    {
      id: 2, name: 'Parent 2', children: [
        { id: 20, name: 'Child 2.1' },
        { id: 21, name: 'Child 2.2' }
      ]
    },
    { id: 3, name: 'Parent 3' },
    {
      id: 4, name: 'Parent 4', children: [
        { id: 40, name: 'Child 4.1' },
        { id: 41, name: 'Child 4.2' },
        { id: 42, name: 'Child 4.3' }
      ]
    }
  ]
}
