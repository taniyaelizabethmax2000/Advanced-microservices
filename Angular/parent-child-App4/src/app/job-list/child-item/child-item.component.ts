import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child-item',
  templateUrl: './child-item.component.html',
  styleUrls: ['./child-item.component.css']
})
export class ChildItemComponent {
  @Input() child: any;
  constructor() { }

  ngOnInit() {
  }

}
