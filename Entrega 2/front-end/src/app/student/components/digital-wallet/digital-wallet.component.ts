import { DigitalWalletModel } from './../../models/digital-wallet.model';
import { StudentFacadeService } from './../../facades/student-facade.service';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-digital-wallet',
  templateUrl: './digital-wallet.component.html',
  styleUrls: ['./digital-wallet.component.scss']
})
export class DigitalWalletComponent implements OnInit {
  @Input() digitalWalletModel: DigitalWalletModel = new DigitalWalletModel();

  constructor(private studentFacadeService: StudentFacadeService) { }

  ngOnInit(): void {
  }

}
