import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../model/Product';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  product:Product=new Product();
  constructor(private productService:ProductService,private router:Router){}

  ngOnInit():void{

  }
  onSubmit(){
    this.saveProduct();
    console.log(this.product); 
    
  }

saveProduct(){
this.productService.saveProduct(this.product).subscribe(
  //data=>{console.log(data);
  (data) => {
   
    this.gotoProductList();
},
error=>console.log(error));
}
gotoProductList() {
  this.router.navigate(['/retrieve']);
}
}
