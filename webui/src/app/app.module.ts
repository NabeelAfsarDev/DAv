import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { LoginBodyComponent } from './login-body/login-body.component';
import { FooterComponent } from './footer/footer.component';
import { MenuServiceService }  from './services/menu-service.service'
import { HttpClientModule } from '@angular/common/http';
import { RouterModule , Routes } from '@angular/router';
import { MenuBodyComponent } from './menu-body/menu-body.component';

const appRoutes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full'},

      {
        path: 'login',
        component:LoginBodyComponent,
      },
      {
        path:'menu',
        component:MenuBodyComponent,
      }

];

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LoginBodyComponent,
    FooterComponent,
    MenuBodyComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes,
      {enableTracing:true}
      ),
  ],
  providers: [
    MenuServiceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
