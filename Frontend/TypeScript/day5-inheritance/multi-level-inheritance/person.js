"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.person = void 0;
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    person.prototype.getName = function () {
        return this.name;
    };
    person.prototype.setRole = function (name) {
        this.name = name;
    };
    person.prototype.getAge = function () {
        return this.age;
    };
    person.prototype.setAge = function (age) {
        this.age = age;
    };
    person.prototype.introduce = function () {
        console.log("\n        My name is  + ".concat(this.name, " +  and I am  + ").concat(this.age, " + years old."));
    };
    return person;
}());
exports.person = person;
