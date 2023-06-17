import { Component, OnInit } from '@angular/core';
import { Product } from '../model/Product';
import { ProductService } from '../services/product.service';


@Component({
  selector: 'app-retrieve',
  templateUrl: './retrieve.component.html',
  styleUrls: ['./retrieve.component.css']
})
export class RetrieveComponent implements OnInit {

  constructor(private services:ProductService){}
    products:Product[]=[];
  
  ngOnInit():void{
    this.products=this.getProducts();
  }
  getProducts():any{
     this.services.getProducts().subscribe((products)=>{
     this.products=products;
  });
}

}
