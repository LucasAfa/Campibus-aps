import { StudentFormComponent } from '../student-form/student-form.component';
import { StudentModel } from './../../models/student.model';
import { AdminFacadeService } from './../../facades/admin-facade.service';
import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { PaymentsListComponent } from '../payments-list/payments-list.component';

@Component({
  selector: 'app-students-list',
  templateUrl: './students-list.component.html',
  styleUrls: ['./students-list.component.scss']
})
export class StudentsListComponent implements OnInit {

  students: StudentModel[] = [];
  studentsLoaded: boolean = false;

  displayedColumns: string[] = ['name', 'age', 'school', 'course', 'actions'];

  constructor(private adminFacadeService: AdminFacadeService, private dialog: MatDialog) { }

  ngOnInit(): void {
    this.getStudents();
  }

  getStudents(): void {
    this.adminFacadeService.getStudents().subscribe((students) => {this.students = students; this.studentsLoaded = true})
  }

  seePaymentsModal(id: string): void {
    this.dialog.open(PaymentsListComponent, {
      data: {'studentId': id}
    });
  }

  openStudentAddModal(): void {
    this.dialog.open(StudentFormComponent, {
      data: {'type': 'add'}
    }).afterClosed().subscribe(() => this.getStudents())
  }

  openStudentEditModal(studentModel: StudentModel): void {
    this.dialog.open(StudentFormComponent, {
      data: {'type': 'edit', 'studentModel': studentModel}
    }).afterClosed().subscribe(() => this.getStudents())
  }

  deleteStudent(id: string): void {
    this.adminFacadeService.deleteStudent(id).subscribe(() => this.getStudents());
  }

}
