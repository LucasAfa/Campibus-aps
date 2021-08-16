import { DigitalWalletModel } from './../../models/digital-wallet.model';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { StudentFacadeService } from '../../facades/student-facade.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.scss']
})
export class StudentComponent implements OnInit {

  studentId: string;
  digitalWalletModel: DigitalWalletModel = new DigitalWalletModel();
  loadedStudent: boolean = false;

  constructor(private studentFacadeService: StudentFacadeService, private activatedRoute: ActivatedRoute) {
    this.studentId = this.activatedRoute.snapshot.params.id;
  }

  ngOnInit(): void {
    this.studentFacadeService.getDigitalWallet(this.studentId).subscribe((digitalWalletModel) => {
      this.digitalWalletModel = digitalWalletModel;
      this.loadedStudent = true;
    });
  }

}
