import { MatDialog } from '@angular/material/dialog';
import { AdminFacadeService } from '../../facades/admin-facade.service';
import { Component, Inject, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { StudentModel } from '../../models/student.model';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';

@Component({
  selector: 'app-student-form',
  templateUrl: './student-form.component.html',
  styleUrls: ['./student-form.component.scss']
})
export class StudentFormComponent implements OnInit {

  name = new FormControl('', [Validators.required]);
  age = new FormControl('', [Validators.required]);
  school = new FormControl('', [Validators.required]);
  course = new FormControl('', [Validators.required]);

  constructor(
    private adminFacadeService: AdminFacadeService, 
    private dialog: MatDialog, 
    @Inject(MAT_DIALOG_DATA) public data: any
  ) { }

  ngOnInit(): void {
    if(this.data.type === 'edit') {
      this.name.setValue(this.data.studentModel.name);
      this.age.setValue(this.data.studentModel.age);
      this.school.setValue(this.data.studentModel.school);
      this.course.setValue(this.data.studentModel.course);
    }
  }

  saveStudent() {
    if(this.data.type === 'add') {
      this.adminFacadeService
      .addStudent(new StudentModel(this.name.value, this.age.value, this.school.value, this.course.value))
      .subscribe(() => this.dialog.closeAll())
    } else {
      this.adminFacadeService
      .editStudent(this.data.studentModel.id, new StudentModel(this.name.value, this.age.value, this.school.value, this.course.value))
      .subscribe(() => this.dialog.closeAll())
    }
    
  }

}

