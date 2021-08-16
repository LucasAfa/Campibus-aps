import { CardModel } from './../models/card.model';
import { StudentService } from './../api/student.service';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentFacadeService {

  constructor(private studentService: StudentService) { }

  getDigitalWallet(id: string): Observable<any> {
    return this.studentService.getDigitalWallet(id);
  }

  getCards(id: string): Observable<any> {
    return this.studentService.getCards(id);
  }

  addCard(id: string, cardModel: CardModel): Observable<any> {
    return this.studentService.addCard(id, cardModel);
  }

  deleteCard(id: string): Observable<any> {
    return this.studentService.deleteCard(id);
  }

  pay(cardId: string, studentId: string): Observable<any> {
    return this.studentService.pay(cardId, studentId);
  }
}
