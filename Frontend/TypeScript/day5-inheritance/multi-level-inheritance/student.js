"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.student = void 0;
var person_1 = require("./person");
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, id) {
        var _this = _super.call(this, name, age) || this;
        _this.id = id;
        return _this;
    }
    student.prototype.getId = function () {
        return this.id;
    };
    student.prototype.setId = function (id) {
        this.id = id;
    };
    student.prototype.introduce = function () {
        console.log("\n        Name: ".concat(this.getName(), "\n        Student id: ").concat(this.id, "\n        is studying."));
    };
    return student;
}(person_1.person));
exports.student = student;
