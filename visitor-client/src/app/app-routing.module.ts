import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {VisitorFormComponent} from './component/visitor-form/visitor-form.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/visitors',
    pathMatch: 'full'
  },
  {
    path: 'visitors',
    component: VisitorFormComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
