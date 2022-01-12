import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {


  url = "http://localhost:9595"

  constructor(private http: HttpClient) { }


  //calling the server to generate the token
  generateToken(credentials: any) {
    //token generate

    return this.http.post(`${this.url}/token`, credentials)
  }


  //for login user
  loginUser(token: any) {
    localStorage.setItem("token", token)
    return true;
  }

  //for checking if the user is logged in or not
  isLoggenIn() {
    let token = localStorage.getItem("token");
    if (token == undefined || token === '' || token == null) {
      return false;
    } else {
      return true;
    }

  }

  //for logout of the user
  logout() {
    localStorage.removeItem('token');
    return true;
  }
  // getting token
  getToken() {
    return localStorage.getItem("token")
  }
}

