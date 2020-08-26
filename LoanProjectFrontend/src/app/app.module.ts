import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FirstPageWelcomeComponent } from './components/first-page-welcome/first-page-welcome.component';
import { SecondPageSubmitComponent } from './components/second-page-submit/second-page-submit.component';
import { ThirdPageViewComponent } from './components/third-page-view/third-page-view.component';
import { FourthPageViewComponent } from './components/fourth-page-view/fourth-page-view.component';
import { FifthPageSuccessComponent } from './components/fifth-page-success/fifth-page-success.component';
import { AppRouterModule } from './routing.module';
import { HttpClientModule } from '@angular/common/http';
import { LoanApplyService } from './services/loan-apply.service';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    FirstPageWelcomeComponent,
    SecondPageSubmitComponent,
    ThirdPageViewComponent,
    FourthPageViewComponent,
    FifthPageSuccessComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRouterModule,
    ReactiveFormsModule
  ],
  providers: [LoanApplyService],
  bootstrap: [FirstPageWelcomeComponent]
})
export class AppModule { }
