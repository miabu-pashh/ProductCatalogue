import { Component, OnInit } from '@angular/core';
import { ItemsService } from './items.service';
import { LoginService } from './services/login.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css','./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'exitTest-Frontend';
  public loggedIn=false;


  
  constructor(private loginService:LoginService,private service:ItemsService){}
  ngOnInit():void{
    this.loggedIn=this.loginService.isLoggenIn()

  }
  logoutUser(){
    this.loginService.logout();
    location.reload();
  }

  
 

}
