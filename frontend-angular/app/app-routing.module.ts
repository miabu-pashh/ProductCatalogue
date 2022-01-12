import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
 import { AppComponent } from './app.component';
import { ItemsListComponent } from './items-list/items-list.component';
import { AuthGuard } from './services/auth.guard';
import { RegisterComponent } from './register/register.component';
import { ItemDetailsComponent } from './item-details/item-details.component';
import { SearchComponent } from './search/search.component';
import { DeliveryDetailsComponent } from './delivery-details/delivery-details.component';

const routes: Routes = [

  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'items-list',
    component:ItemsListComponent,
    pathMatch:"full",
    canActivate:[AuthGuard]
  },
  {
    path:'home',
    component:HomeComponent,
    pathMatch:"full",
    canActivate:[AuthGuard]
  },
  {
    path:'register',
    component:RegisterComponent
  },
  {
    path:'itemdetails/:id',
    component:ItemDetailsComponent,
    
  },{
    path:'search',
    component:SearchComponent
  },
  {
    path:'delivery',
    component:DeliveryDetailsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
