export class CardModel {
    ownerName?: string;
    cardholder?: string;
    number?: string;
    validUntil?: string;
    code?: string;
    id?: string;

    constructor(ownerName?: string, cardholder?: string, number?: string, validUntil?: string, code?: string, id?: string) {
        this.ownerName = ownerName;
        this.cardholder = cardholder;
        this.number = number;
        this.validUntil = validUntil;
        this.code = code;
        this.id = id;
    }
}