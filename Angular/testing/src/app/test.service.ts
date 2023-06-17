import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TestService {

  constructor() { }
  factorial(n:number){
    let fact:any=1;//any means any datatype int fact=1
    for(var i=1;i<=n;i++){
      fact*=i;

    }
    return fact;
  }

  sum(b:number,a:number){
    let result=a+b
    return result;
  }
}
