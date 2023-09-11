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
exports.car = void 0;
var vehicle_1 = require("./vehicle");
var car = /** @class */ (function (_super) {
    __extends(car, _super);
    function car(make, model, year) {
        var _this = _super.call(this, make, model) || this;
        _this.year = year;
        return _this;
    }
    car.prototype.start = function () {
        console.log("Starting the vehicle.");
    };
    car.prototype.stop = function () {
        console.log("Stopping the vehicle.");
    };
    car.prototype.displayInfo = function () {
        _super.prototype.displayInfo.call(this);
        console.log("\n                 Year: ".concat(this.year, "\n                "));
    };
    return car;
}(vehicle_1.vehicle));
exports.car = car;
