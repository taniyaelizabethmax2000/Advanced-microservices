import { Component, OnInit } from '@angular/core';
import { Product } from '../model/Product';
import { ProductService } from '../services/product.service';


@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit{
  
    
  productId: number = 0;
  product: any;

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
  }

  retrieveProductById(): void {
    this.productService.getProductById(this.productId).subscribe(
      (product) => {
        this.product = product;
      },
      (error) => {
        console.log('Error retrieving product:', error);
      }
    );
  }

  // search(){
  //   console.log("search called"+this.productId);
  //   this.productService.getProductById(this.productId).subscribe(data=>{
  //     this.product=data;
  //     console.log(data);
  //   },
  //  error=>console.log(error) );
  // }

  saveUpdatedProduct(): void {
    this.productService.saveProduct(this.product).subscribe(
      (response) => {
        console.log('Product updated successfully');
      },
      (error) => {
        console.log('Error updating product:', error);
      }
    );
  }
  // onSubmit(){
  //   console.log('update-submitted'+this.product);
  //   this.productService.updateProduct(this.product).subscribe(data=>{
  //     console.log(data);
  //   },
  //  (error)=>{
  //   console.log(error);
  //  })
  // }
}
  

