import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { LoginBodyComponent } from './login-body/login-body.component';
import { FooterComponent } from './footer/footer.component';
import { MenuServiceService }  from './services/menu-service.service'
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LoginBodyComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [
    MenuServiceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
