import { Component, OnInit } from '@angular/core';
import { ItemsService } from '../items.service';
import { Products } from '../products';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {
  itemname!:string;
  item:any;


  products:Products=new Products();
  collections:any=[]

  constructor(private service:ItemsService) { }

  ngOnInit(): void {

  }
  public findByName(){
    let response=this.service.getItemsByName(this.itemname);
    console.log(this.itemname);
    response.subscribe(data=>{
      // data=>this.item=data
      this.collections=Array.of(data);}
      )
      console.log(this.collections);
  }
  

}
