import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  user:any
  constructor(private userService:UserService) { }

  ngOnInit(): void {
  }
  getUser()
  {
    this.userService.getUser().subscribe(
      user=>{
        console.log(user)
      },error=>{
        console.log("vachindi ra maibu...chuskoni pani chey!!");

      }
    )

  }

}
