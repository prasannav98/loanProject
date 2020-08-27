import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';
import { LoanApplyService } from '../../services/loan-apply.service';

@Component({
  selector: 'app-third-page-view',
  templateUrl: './third-page-view.component.html',
  styleUrls: ['./third-page-view.component.css']
})
export class ThirdPageViewComponent implements OnInit {
  public data:any;
  public dataspecific:any;
  constructor(private router:Router,private _service:LoanApplyService) { }

  ngOnInit(): void {
    this._service.getDetails().subscribe(response=>{
      this.data = response;
      console.log(this.data);
    });
  }

  public onPress(id:number){
    this._service.getDetailOfId(id).subscribe(res=>{
      this.dataspecific=res;
      console.log(this._service.loanData2)
      this.router.navigate(['/fourthPageView']) 
    })
  }
  
  public handleClick3(){
    this.router.navigate(['/firstPageWelcome'])
  }

}
