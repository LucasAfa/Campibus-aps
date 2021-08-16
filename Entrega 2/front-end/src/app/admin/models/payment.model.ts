export class PaymentModel {
    studentId?: string;
    timestamp?: string;
    amount?: number;
    id?: string;

    constructor(studentId?: string, timestamp?: string, amount?: number, id?: string) {
        this.studentId = studentId;
        this.timestamp = timestamp;
        this.amount = amount;
        this.id = id;
    }
}