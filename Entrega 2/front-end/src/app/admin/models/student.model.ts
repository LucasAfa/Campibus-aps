export class StudentModel{
    name?: string
    age?: number;
    school?: string;
    course?: string;
    busId?: string;
    card?: any;
    id?: string;

    constructor(name?: string, age?: number, school?: string, course?: string, busId?: string, card?: any, id?: string) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.course = course;
        this.busId = busId;
        this.card = card;
        this.id = id;
    }
}