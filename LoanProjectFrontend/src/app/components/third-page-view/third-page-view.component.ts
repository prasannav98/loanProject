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
  constructor(private router:Router,private _service:LoanApplyService) { }

  ngOnInit(): void {
    this._service.getDetails().subscribe(response=>{
      this.data = response;
    });
  }

  public handleClick3(){
    this.router.navigate(['/firstPageWelcome'])
  }

}
