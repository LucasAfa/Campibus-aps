export class DigitalWalletModel {
    name?: string
    age?: number;
    school?: string;
    course?: string;
    id?: string;

    constructor(name?: string, age?: number, school?: string, course?: string, id?: string) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.course = course;
        this.id = id;
    }
}