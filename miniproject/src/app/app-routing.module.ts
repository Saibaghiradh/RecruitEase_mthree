import { NgModule } from '@angular/core';
import { RouterModule, Routes, ExtraOptions } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { ForgotComponent } from './components/forgot/forgot.component';
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';
import { AdminhomeComponent } from './components/adminhome/adminhome.component';

const routes: Routes = [
  
  {path:"login",component:LoginComponent},
  {path:"register",component:RegisterComponent},
  {path:"forgot",component:ForgotComponent},
  {path:"admin",component:AdminComponent},
  {path:"home", component:HomeComponent },
  {path:"adminhome",component:AdminhomeComponent}
];

const routerOptions :ExtraOptions={
  scrollPositionRestoration:'enabled',
  anchorScrolling:'enabled',
}
@NgModule({
  imports: [RouterModule.forRoot(routes,routerOptions)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
