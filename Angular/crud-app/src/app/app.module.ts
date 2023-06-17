import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { RetrieveComponent } from './retrieve/retrieve.component';
import {HttpClientModule} from '@angular/common/http';
import { CreateComponent } from './create/create.component';

  import { FormsModule } from '@angular/forms';
import { UpdateComponent } from './update/update.component';
import { DeleteComponent } from './delete/delete.component';
@NgModule({
  declarations: [
    AppComponent,
    RetrieveComponent,
    CreateComponent,
    UpdateComponent,
    DeleteComponent
  ],
  imports: [
    BrowserModule,HttpClientModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
