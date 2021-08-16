import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CardModel } from '../models/card.model';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private httpClient: HttpClient) { }

  getDigitalWallet(id: string): Observable<any> {
    return this.httpClient.get(`${environment.digitalWalletAPI}/wallets/${id}`);
  }

  getCards(id: string): Observable<any> {
    return this.httpClient.get(`${environment.coreAPI}/cards/student/${id}`);
  }

  addCard(id: string, cardModel: CardModel): Observable<any> {
    return this.httpClient.post(`${environment.coreAPI}/cards/`, {
      studentId: id,
      card: {
        ownerName: cardModel.ownerName,
        cardholder: cardModel.cardholder,
        number: cardModel.number,
        validUntil: cardModel.validUntil,
        code: cardModel.code
      }
    });
  }

  deleteCard(id: string): Observable<any> {
    return this.httpClient.delete(`${environment.coreAPI}/cards/${id}`);
  }

  pay(cardId: string, studentId: string): Observable<any> {
    return this.httpClient.post(`${environment.paymentsAPI}/payments/`, {
      cardId: cardId,
      studentId: studentId
    });
  }

}
