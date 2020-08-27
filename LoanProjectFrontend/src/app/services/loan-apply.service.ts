import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoanApplyService {

  loanUrl:string = "http://localhost:8080/loans";
  loanApplicationUrl:string = "http://localhost:8080/apply"
  loanData1:any;
  loanData2:any;

  constructor(private _httpClient:HttpClient) { }

  public getDetails():any{
    return this._httpClient.get(this.loanUrl).pipe(
      map(res=>{
        console.log(res);
        this.loanData1 = res;
        return this.loanData1;
      },
      error=>{
        console.error("Error is "+error);
      })
    )
  }

  public getDetailOfId(id:number):any{
    return this._httpClient.get(this.loanUrl+"/"+id).pipe(
      map(res=>{
        console.log(res);
        this.loanData2=res;
        return this.loanData2;
      },
      error=>{
        console.error("Error is "+error);
      })
    )
  }

  public saveDetails(details):any{
    return this._httpClient.post(this.loanApplicationUrl,details).pipe(
      map(res=>{
        return res;
      },
      err=>{
        console.error(err);
      })
    )
  }
  public success(value):any{
    console.log("success");
  }
  public error(value):any{
    console.error("failure");
  }
}
