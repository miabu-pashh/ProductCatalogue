import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import { User } from '../user';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  user:User=new User();

  constructor(private registerService:RegisterService) { }

  ngOnInit(): void {
  }
  userRegister(){
    console.log(this.user);
    this.registerService.registerUser(this.user).subscribe(data=>{
      alert("Your Registration is Succsefully Done!!")
      window.location.href="/login"
    },error=>alert("Sorry you are not registerd yet!!"));
  }
  

}
