import { MatDialog } from '@angular/material/dialog';
import { CardModel } from './../../models/card.model';
import { Component, OnInit, Input } from '@angular/core';
import { StudentFacadeService } from '../../facades/student-facade.service';
import { CardFormComponent } from '../card-form/card-form.component';

@Component({
  selector: 'app-cards-list',
  templateUrl: './cards-list.component.html',
  styleUrls: ['./cards-list.component.scss']
})
export class CardsListComponent implements OnInit {
  @Input() studentId: string = "";
  cards: CardModel[] = [];
  cardsLoaded: boolean = false;

  displayedColumns: string[] = ['ownerName', 'cardholder', 'number', 'validUntil', 'code', 'actions'];

  constructor(private studentFacadeService: StudentFacadeService, private dialog: MatDialog) { }

  ngOnInit(): void {
    this.getCards();
  }

  getCards(): void {
    this.studentFacadeService.getCards(this.studentId).subscribe((cards) => {
      this.cards = cards;
      this.cardsLoaded = true;
    });
  }

  openCardAddModal(): void {
    this.dialog.open(CardFormComponent, {
      data: {'type': 'add', 'studentId': this.studentId}
    }).afterClosed().subscribe(() => this.getCards())
  }
  
  deleteCard(id: string): void {
    this.studentFacadeService.deleteCard(id).subscribe(() => this.getCards())
  }

  pay(id: string): void {
    this.studentFacadeService.pay(id, this.studentId).subscribe(() => window.alert('Pago!'))
  }

}
