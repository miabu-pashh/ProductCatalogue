import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ItemsService } from '../items.service';
import { Products } from '../products';

@Component({
  selector: 'app-items-list',
  templateUrl: './items-list.component.html',
  styleUrls: ['./items-list.component.css','./items-list.component.scss']
})
export class ItemsListComponent implements OnInit {
  items!:Products[];
  name:any;

  constructor(private itemsService:ItemsService,private router:Router) { }

  ngOnInit(): void {
    this.itemsService.getItemsList().subscribe(data=>{
      this.items=data;
    })
  }
  itemDetails(id:number){
    this.router.navigate(['itemdetails',id]);
    
    
  }
  Search(){
    if(this.name==""){
      this.ngOnInit();

    }else{
      this.items=this.items.filter(res=>{
        return res.name.toLocaleLowerCase().match(this.name.toLocaleLowerCase());
      })
    }
  }

}
