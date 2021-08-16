import { Component, Inject, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { StudentFacadeService } from '../../facades/student-facade.service';
import { CardModel } from '../../models/card.model';

@Component({
  selector: 'app-card-form',
  templateUrl: './card-form.component.html',
  styleUrls: ['./card-form.component.scss']
})
export class CardFormComponent implements OnInit {

  ownerName = new FormControl('', [Validators.required]);
  cardHolder = new FormControl('', [Validators.required]);
  number = new FormControl('', [Validators.required]);
  validUntil = new FormControl('', [Validators.required]);
  code = new FormControl('', [Validators.required]);

  constructor(
    private studentFacadeService: StudentFacadeService, 
    private dialog: MatDialog, 
    @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    // if(this.data.type === 'edit') {
    //   this.name.setValue(this.data.studentModel.name);
    //   this.age.setValue(this.data.studentModel.age);
    //   this.school.setValue(this.data.studentModel.school);
    //   this.course.setValue(this.data.studentModel.course);
    // }
  }

  saveCard() {
    if(this.data.type === 'add') {
      this.studentFacadeService
      .addCard(this.data.studentId, new CardModel(this.ownerName.value, this.cardHolder.value, this.number.value, this.validUntil.value, this.code.value))
      .subscribe(() => this.dialog.closeAll())
    }
    // } else {
    //   this.studentFacadeService
    //   .editStudent(this.data.studentModel.id, new StudentModel(this.name.value, this.age.value, this.school.value, this.course.value))
    //   .subscribe(() => this.dialog.closeAll())
    // }
    
  }

}
