import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DigitalWalletComponent } from './digital-wallet.component';

describe('DigitalWalletComponent', () => {
  let component: DigitalWalletComponent;
  let fixture: ComponentFixture<DigitalWalletComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DigitalWalletComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DigitalWalletComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
