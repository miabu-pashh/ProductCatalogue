import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
// import { ItemsComponent } from './items/items.component';
import { ItemsListComponent } from './items-list/items-list.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from "@angular/material/button";
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component'
import { MatToolbarModule } from '@angular/material/toolbar'
import { FormsModule } from '@angular/forms';
import { LoginService } from './services/login.service';
import { AuthGuard } from './services/auth.guard';
import { AuthInterceptor } from './services/auth.intercepter';

import { RegisterComponent } from './register/register.component';
import { ItemDetailsComponent } from './item-details/item-details.component';
import { SearchComponent } from './search/search.component';
import{Ng2SearchPipeModule} from 'ng2-search-filter';
import {Ng2OrderModule} from 'ng2-order-pipe';
import{NgxPaginationModule} from 'ngx-pagination';
import { DeliveryDetailsComponent } from './delivery-details/delivery-details.component';


@NgModule({
  declarations: [
    AppComponent,
    ItemsListComponent,
    NavBarComponent,
    HomeComponent,
    LoginComponent,
    DashboardComponent,
    RegisterComponent,
       ItemDetailsComponent,
       SearchComponent,
       DeliveryDetailsComponent,
       

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatToolbarModule,
    FormsModule,
    Ng2SearchPipeModule,
    Ng2OrderModule,
    NgxPaginationModule,

  ],
  // providers: [LoginService,AuthGuard,[{provide:HTTP_INTERCEPTORS,userClass:AuthInterceptor,multi:true}]],
  providers: [LoginService,AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
