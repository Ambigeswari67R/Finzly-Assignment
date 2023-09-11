"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var student_1 = require("./student");
var teacher_1 = require("./teacher");
var teacherobj = new teacher_1.teacher("Ambika", 21, 1, "Angular");
teacherobj.introduce();
var stuobj = new student_1.student("Ambika", 21, 1);
stuobj.introduce();
