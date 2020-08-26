import { Component,OnInit } from '@angular/core';
import { FormGroup,FormControl,FormArray, NgForm } from '@angular/forms';
import { Validators } from '@angular/forms';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { LoanApplyService } from '../../services/loan-apply.service';

@Component({
  selector: 'app-second-page-submit',
  templateUrl: './second-page-submit.component.html',
  styleUrls: ['./second-page-submit.component.css']
})
export class SecondPageSubmitComponent {
  public personForm:FormGroup;
  public marital:string[]
  constructor(private router:Router,private participantService : LoanApplyService,private alertifyService : LoanApplyService){}

  ngOnInit(){
    //this.marital=["Single","Married","Separated","Widowed","Divorced"]
      this.personForm = new FormGroup({
      firstName:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      middleName:new FormControl("",[Validators.maxLength(255)]),
      lastName:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      dob:new FormControl("",[Validators.required]),
      marital:new FormControl("",[Validators.required]),
      ssn:new FormControl("",[Validators.required]),
      loanAmount:new FormControl("",[Validators.required]),
      loanPurpose:new FormControl("",[Validators.required]),
      description:new FormControl(),

      addressline1:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      addressline2:new FormControl("",[Validators.maxLength(255)]),
      city:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      state:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      postalcode:new FormControl("",[Validators.required,Validators.maxLength(5)]),
  
      hphone:new FormControl("",[Validators.required]),
      ophone:new FormControl(),
      mobile:new FormControl("",[Validators.required]),
      email:new FormControl("",[Validators.required]),

      emp_name:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      annual_salary:new FormControl("",[Validators.required]),
      designation:new FormControl("",[Validators.maxLength(255)]),
      work_exp:new FormControl(),
      addressline1_e:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      addressline2_e:new FormControl("",[Validators.maxLength(255)]),
      city_e:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      state_e:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      postalcode_e:new FormControl("",[Validators.required]), 
    });
  }
  public handleClick4(){
     // console.log(this.personForm.valid);
     this.participantService.saveDetails(this.personForm).subscribe(participant=>{
       this.alertifyService.success('participant successfully added');
       this.router.navigate(['/fifthPageSuccess']);
     },
     error=>{
       this.alertifyService.error('Problem occured!\n'+error);
     });
  }
  
}
