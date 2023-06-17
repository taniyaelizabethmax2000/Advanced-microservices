import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../model/Product';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-retrieve',
  templateUrl: './retrieve.component.html',
  styleUrls: ['./retrieve.component.css']
})
export class RetrieveComponent implements OnInit {
  constructor(private services:ProductService,private router:Router){}
  products:Product[]=[];
  

ngOnInit():void{
 this.products=this.getProducts();
}
getProducts():any{
   this.services.getProducts().subscribe((products)=>{
    this.products=products;
 });
 }
 deleteProduct(id: number): void{
  this.services.deleteProductById(id).subscribe(
    (response) => {
      console.log('Product deleted successfully:');
    },
    (error) => {
      console.log('Error deleting product:', error);
    }
  );
  
}
gotoProductList(){
  this.router.navigate(['/retrieve']);
}

 


}
