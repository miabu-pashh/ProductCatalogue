import { ArrayType } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Delivery } from '../delivery';
import { ItemsService } from '../items.service';
import { Products } from '../products';


@Component({
  selector: 'app-item-details',
  templateUrl: './item-details.component.html',
  styleUrls: ['./item-details.component.scss','./item-details.component.css']
})
export class ItemDetailsComponent implements OnInit {
  id!:number;
  products:Products=new Products();
  collections:any=[]

  constructor(private itemService:ItemsService,private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.products= new Products();
    this.itemService.getItemDetailsById(this.id).subscribe(data=>{
      // this.products=data;
      this.collections=Array.of(data);



      // this.items=data;
    })

  }
  pincode!:any;
  delivery:Delivery=new Delivery();
  delivery1:any=[]
  public findDeliveryById(){
    let response=this.itemService.getDeliveryById(this.pincode);
    console.log(this.pincode);
     // window.location.href="/delivery"

    response.subscribe(data=>{
      this.delivery1=Array.of(data);
      alert("the product will be deliverable to your location")
    }, error=>{

    })
      
  }




}
