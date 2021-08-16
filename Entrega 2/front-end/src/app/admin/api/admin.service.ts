import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StudentModel } from '../models/student.model';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private httpClient: HttpClient) { }

  getStudents(): Observable<any> {
    return this.httpClient.get(`${environment.coreAPI}/students`);
  }

  addStudent(studentModel: StudentModel): Observable<any> {
    return this.httpClient.post(`${environment.coreAPI}/students`, {
      name: studentModel.name,
      age: studentModel.age,
      school: studentModel.school,
      course: studentModel.course
    });
  }

  editStudent(id: string, studentModel: StudentModel): Observable<any> {
    return this.httpClient.put(`${environment.coreAPI}/students/${id}`, {
      name: studentModel.name,
      age: studentModel.age,
      school: studentModel.school,
      course: studentModel.course
    });
  }

  deleteStudent(id: string): Observable<any> {
    return this.httpClient.delete(`${environment.coreAPI}/students/${id}`);
  }

  getPayments(id: string): Observable<any> {
    return this.httpClient.get(`${environment.paymentsAPI}/payments/${id}`);
  }
}
