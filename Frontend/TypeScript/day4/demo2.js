"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.avgSalary = exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(id, name, salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employee.prototype.display = function () {
        console.log(" \n                   ID : ".concat(this.id, "\n                   NAME : ").concat(this.name, "\n                   SALARY: ").concat(this.salary));
    };
    return Employee;
}());
exports.Employee = Employee;
// let obj=new Employee(1,'Ambika',50000)
// obj.display();
function avgSalary(a, b) {
    console.log("\n                Average Salary : ".concat((a + b) / 2, " "));
}
exports.avgSalary = avgSalary;
