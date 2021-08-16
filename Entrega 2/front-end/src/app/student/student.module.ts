import { StudentRoutingModule } from './student-routing.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { StudentComponent } from './containers/student/student.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MaterialModule } from '../material.module';
import { DigitalWalletComponent } from './components/digital-wallet/digital-wallet.component';
import { CardsListComponent } from './components/cards-list/cards-list.component';
import { CardFormComponent } from './components/card-form/card-form.component';



@NgModule({
  declarations: [
    StudentComponent,
    DigitalWalletComponent,
    CardsListComponent,
    CardFormComponent
  ],
  imports: [
    CommonModule,
    StudentRoutingModule,
    MaterialModule,
    FormsModule,
    ReactiveFormsModule,
  ]
})
export class StudentModule { }
