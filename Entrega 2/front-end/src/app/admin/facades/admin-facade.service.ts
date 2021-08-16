import { AdminService } from './../api/admin.service';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { StudentModel } from './../models/student.model';

@Injectable({
  providedIn: 'root'
})
export class AdminFacadeService {

  constructor(private adminService: AdminService) { }

  getStudents(): Observable<any> {
    return this.adminService.getStudents();
  }

  addStudent(studentModel: StudentModel): Observable<any> {
    return this.adminService.addStudent(studentModel);
  }

  editStudent(id: string, studentModel: StudentModel): Observable<any> {
    return this.adminService.editStudent(id, studentModel);
  }

  deleteStudent(id: string): Observable<any> {
    return this.adminService.deleteStudent(id);
  }

  getPayments(id: string): Observable<any> {
    return this.adminService.getPayments(id);
  }
}
