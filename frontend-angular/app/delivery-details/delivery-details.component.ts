import { Component, OnInit } from '@angular/core';
import { Delivery } from '../delivery';
import { ItemsService } from '../items.service';

@Component({
  selector: 'app-delivery-details',
  templateUrl: './delivery-details.component.html',
  styleUrls: ['./delivery-details.component.scss']
})
export class DeliveryDetailsComponent implements OnInit {
  pincode!:any;
  delivery:Delivery=new Delivery();
  delivery1:any=[]

  constructor(private itemService:ItemsService) { }

  ngOnInit(): void {
    this.delivery1=this.itemService.getDelivery();
  }

}
