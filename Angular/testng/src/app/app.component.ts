import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <div>
      <h1>Welcome to My Component</h1>
      <button>Click Me</button>
      <p>{{ message }}</p>
    </div>
  `
})
export class AppComponent {
  title = 'testng';
  message = 'Hello!';
}
