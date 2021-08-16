import { PaymentModel } from './../../models/payment.model';
import { Component, Inject, OnInit } from '@angular/core';
import { AdminFacadeService } from '../../facades/admin-facade.service';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-payments-list',
  templateUrl: './payments-list.component.html',
  styleUrls: ['./payments-list.component.scss']
})
export class PaymentsListComponent implements OnInit {

  payments: PaymentModel[] = [];
  paymentsLoaded: boolean = false;

  displayedColumns: string[] = ['timestamp', 'amount'];

  constructor(
    private adminFacadeService: AdminFacadeService,     
    private dialog: MatDialog, 
    @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    this.getPayments();
  }
 
  getPayments(): void {
    this.adminFacadeService.getPayments(this.data.studentId).subscribe((payments) => {this.payments = payments; this.paymentsLoaded = true})
  }

}
