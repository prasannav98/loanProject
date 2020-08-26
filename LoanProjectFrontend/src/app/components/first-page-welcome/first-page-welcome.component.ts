import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-first-page-welcome',
  templateUrl: './first-page-welcome.component.html',
  styleUrls: ['./first-page-welcome.component.css']
})
export class FirstPageWelcomeComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  public handleClick1(){
    this.router.navigate(['/secondPageSubmit'])
  }

  public handleClick2(){
    this.router.navigate(['/thirdPageView'])
  }
}
