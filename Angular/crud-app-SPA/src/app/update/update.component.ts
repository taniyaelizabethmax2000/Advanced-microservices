import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../model/Product';


@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit{

// productId!:number;
  //product: Product=new Product();
 productId: any;
  product: any;

  constructor(private productservice:ProductService,private route:ActivatedRoute,private router:Router) { }

  ngOnInit(): void {
    this.productId=this.route.snapshot.params['productId'];
    this.productservice.getProductById(this.productId).subscribe((product)=>{this.product=product;},(error)=>{console.log("message",error);});
  }

  getProductById(): void {
    this.productservice.getProductById(this.productId).subscribe(
      (product: any) => {
        this.product = product;
      },
      (error: any) => {
        console.log('Error retrieving product:', error);
      }
    );
  }

  

  saveUpdatedProduct(): void {
    this.productservice.saveProduct(this.product).subscribe(
      (data) => {
       // console.log('Product updated successfully');
       this.gotoProductList();
      },
      (error) => {
        console.log('Error updating product:', error);
      }
    );
  
   
}
  gotoProductList() {
    this.router.navigate(['/retrieve']);
  }
}


       
