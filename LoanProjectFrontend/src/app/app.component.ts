import { Component,OnInit } from '@angular/core';
import { FormGroup,FormControl,FormArray, NgForm } from '@angular/forms'
import { Validators } from '@angular/forms'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public personForm:FormGroup;
  public marital:string[]
  constructor(){}

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
      
      address1:new FormGroup({
          addressline1:new FormControl("",[Validators.required,Validators.maxLength(255)]),
          addressline2:new FormControl("",[Validators.maxLength(255)]),
          city:new FormControl("",[Validators.required,Validators.maxLength(255)]),
          state:new FormControl("",[Validators.required,Validators.maxLength(255)]),
          postalcode:new FormControl("",[Validators.required]),
      }),
      contactinfo:new FormGroup({
          hphone:new FormControl("",[Validators.required]),
          ophone:new FormControl(),
          mobile:new FormControl("",[Validators.required]),
          email:new FormControl("",[Validators.required]),
    }),
      emp_details:new FormGroup({
          emp_name:new FormControl("",[Validators.required,Validators.maxLength(255)]),
          annual_salary:new FormControl("",[Validators.required]),
          designation:new FormControl("",[Validators.maxLength(255)]),
          work_exp:new FormControl(),
          address2:new FormGroup({
            addressline1_e:new FormControl("",[Validators.required,Validators.maxLength(255)]),
            addressline2_e:new FormControl("",[Validators.maxLength(255)]),
            city_e:new FormControl("",[Validators.required,Validators.maxLength(255)]),
            state_e:new FormControl("",[Validators.required,Validators.maxLength(255)]),
            postalcode_e:new FormControl("",[Validators.required]),
          })
    }), 
    });
  }
  public onSubmit(){
      console.log(this.personForm.valid);
  }
}
