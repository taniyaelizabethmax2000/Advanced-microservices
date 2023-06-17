import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../model/Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
 

  constructor(private http:HttpClient) { }


  baseURL="http://localhost:8080/product/api.2.0/retrieve";
  getProducts(){
    return this.http.get<Product[]>("http://localhost:8080/product/api.2.0/retrieve/all")
  }
  deleteProductById(id:number): Observable<Object>{
    return this.http.delete(`http://localhost:8080/product/api.2.0/delete/${id}`);
  }

  saveProduct(product:Product):
  Observable<Object>{
    return this.http.post("http://localhost:8080/product/api.2.0/create",product)
  }
  
    updateProduct(product: Product): Observable<Object> {
      return this.http.put(`http://localhost:8080/product/api.2.0/update/${product.productId}`, product);
    }

    getProductById(id: number):Observable<Product>{
      return this.http.get<Product>(`${this.baseURL}/${id}`);
    }
}
