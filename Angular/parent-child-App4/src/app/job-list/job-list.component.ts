import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-job-list',
  templateUrl: './job-list.component.html',
  styleUrls: ['./job-list.component.css']
})
export class JobListComponent {
  @Input()  data: any;
  @Input()  mode: any;

  constructor() { }

  ngOnInit() {
  }

}
