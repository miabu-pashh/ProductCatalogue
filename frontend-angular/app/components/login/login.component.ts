import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  credentials={
    username:'',
    password:''
  }

  constructor(private loginService:LoginService) { }

  ngOnInit(): void {
  }
  onSubmit(){
    console.log("form is submitted");
    if((this.credentials.username!='' && this.credentials.password!='')&& (this.credentials.username!=null && this.credentials.password!=null))
    {
      console.log("we have to submit the values to the server");
      this.loginService.generateToken(this.credentials).subscribe(
        (response:any)=>{
          //successs
          console.log(response.token);
          this.loginService.loginUser(response.token)
          window.location.href="/items-list"

        },
        error=>{
          //error
          console.log(error);

        }
      )
    
    }else{
      console.log("Fields are Empty");
    }
  }

}
