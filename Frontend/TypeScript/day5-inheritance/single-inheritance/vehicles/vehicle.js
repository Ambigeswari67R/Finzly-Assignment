"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.vehicle = void 0;
var vehicle = /** @class */ (function () {
    function vehicle(make, model) {
        this.make = make;
        this.model = model;
    }
    vehicle.prototype.start = function () {
        console.log("Starting the vehicle.");
    };
    vehicle.prototype.stop = function () {
        console.log("Stopping the vehicle.");
    };
    vehicle.prototype.displayInfo = function () {
        console.log("\n                 Make: ".concat(this.make, "\n                 Model: ").concat(this.model));
    };
    return vehicle;
}());
exports.vehicle = vehicle;
