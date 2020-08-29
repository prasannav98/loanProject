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
  public marital:string[];
  public loanData:any;
  public applicantId:any;
  

  constructor(private router:Router,private participantService : LoanApplyService,private alertifyService : LoanApplyService,private service:LoanApplyService){}

  ngOnInit(){
    //this.marital=["Single","Married","Separated","Widowed","Divorced"]
      this.personForm = new FormGroup({
      firstName:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      middleName:new FormControl("",[Validators.maxLength(255)]),
      lastName:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      dateofBirth:new FormControl("",[Validators.required]),
      maritalStatus:new FormControl("",[Validators.required]),
      ssnnumber:new FormControl("",[Validators.required]),
      loanAmount:new FormControl("",[Validators.required]),
      loanPurpose:new FormControl("",[Validators.required]),
      description:new FormControl(),

      addressLine1:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      addressLine2:new FormControl("",[Validators.maxLength(255)]),
      city:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      state:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      postalCode:new FormControl("",[Validators.required,Validators.maxLength(5)]),
  
      homePhone:new FormControl("",[Validators.required]),
      officePhone:new FormControl(),
      mobile:new FormControl("",[Validators.required]),
      emailAddress:new FormControl("",[Validators.required]),

      employername:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      annualSalary:new FormControl("",[Validators.required]),
      designation:new FormControl("",[Validators.maxLength(255)]),
      workExperienceYears:new FormControl(),
      workExperienceMonth:new FormControl(),
      employerAddress1:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      employerAddress2:new FormControl("",[Validators.maxLength(255)]),
      employerCity:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      employerState:new FormControl("",[Validators.required,Validators.maxLength(255)]),
      employerPostalCode:new FormControl("",[Validators.required]), 
    });
  }
 /* public handleClick4(){
     // console.log(this.personForm.valid);
     this.participantService.saveDetails(this.personForm).subscribe(participant=>{
       this.alertifyService.success('participant successfully added');
       this.router.navigate(['/fifthPageSuccess']);
     },
     error=>{
       this.alertifyService.error('Problem occured!\n'+error);
     });
  }*/

  public onSubmit(data){
   // data.applicantId=this.loanData.id;
    this.service.saveDetails(data).subscribe(res=>{
        //this.applicantId=res.id;
        this.router.navigate(['/fifthPageSuccess']);
      }
    //   ,
    //  error=>{
    //    this.alertifyService.error('Problem occured!\n'+error);
    //  }
    );}
  
}
