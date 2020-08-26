import { NgModule } from '@angular/core';
import { Routes,RouterModule} from '@angular/router';
import { FirstPageWelcomeComponent } from './components/first-page-welcome/first-page-welcome.component';
import { SecondPageSubmitComponent } from './components/second-page-submit/second-page-submit.component';
import { ThirdPageViewComponent } from './components/third-page-view/third-page-view.component';
import { FourthPageViewComponent } from './components/fourth-page-view/fourth-page-view.component';
import { FifthPageSuccessComponent } from './components/fifth-page-success/fifth-page-success.component';

const routes:Routes =[
    {path:'',redirectTo:'',pathMatch:'full'},
    {
        path:'firstPageWelcome',
        component:FirstPageWelcomeComponent
    },
    {
         path:'secondPageSubmit',
        component:SecondPageSubmitComponent
    },
    {
        path:'thirdPageView',
        component:ThirdPageViewComponent
    },
    {
        path:'fourthPageView',
        component:FourthPageViewComponent
    },
    {
        path:'fifthPageSuccess',
        component:FifthPageSuccessComponent
    }
];

@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})

export class AppRouterModule{}
