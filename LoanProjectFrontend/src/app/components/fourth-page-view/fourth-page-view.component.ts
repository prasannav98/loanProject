import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';
import { LoanApplyService } from '../../services/loan-apply.service';

@Component({
  selector: 'app-fourth-page-view',
  templateUrl: './fourth-page-view.component.html',
  styleUrls: ['./fourth-page-view.component.css']
})
export class FourthPageViewComponent implements OnInit {
  public data:any;
  public id:number;
  constructor(private router:Router,private _service:LoanApplyService) { }

  ngOnInit(): void {
    this.data = this._service.loanData2;
  }  

  public handleClick3(){
    this.router.navigate(['/thirdPageView'])
  }

}
