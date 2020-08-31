import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-fifth-page-success',
  templateUrl: './fifth-page-success.component.html',
  styleUrls: ['./fifth-page-success.component.css']
})
export class FifthPageSuccessComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  public handleClick5(){
    this.router.navigate([''])
  }

  public handleClick6(){
    this.router.navigate(['/thirdPageView'])
  }

}
