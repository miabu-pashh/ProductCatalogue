import { HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Products } from './products';
import { HttpClient } from '@angular/common/http';
import { Delivery } from './delivery';

@Injectable({
  providedIn: 'root'
})



export class ItemsService {
  

  delivery1:any=[]
  id1:any;
  // private baseUrl="http://localhost:9595/api/v1/items";
  private baseUrl="http://localhost:9595/items";
  private Url="http://localhost:9595/delivery";
  constructor(private httpClient: HttpClient) { }

  getItemsList():Observable<Products[]>{
    return this.httpClient.get<Products[]>(`${this.baseUrl}`);

  }
  getItemDetailsById(id:number):Observable<Products>{
    return this.httpClient.get<Products>(`${this.baseUrl}/${id}`);

  }

  getItemsByName(items: string)
  {
    return this.httpClient.get("http://localhost:9595/search/"+items);

  }
 
  getDeliveryById(pincode:number):Observable<Delivery>{
    this.id1=pincode

    this.delivery1= this.httpClient.get<Delivery>(`${this.Url}/${pincode}`);
    console.log(this.delivery1)
    return this.httpClient.get<Delivery>(`${this.Url}/${pincode}`);
  }
  getDelivery(){
    console.log(this.id1);
    return this.delivery1;
    
  }
  
}
